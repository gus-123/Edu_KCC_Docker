package kosa.thread;

public class SumMain {
    public static void main(String[] args) {
        //t1 : 1 ~ 50 합을 구하는 스레드
        //t2 : 51 ~ 100 합을 구하는 스레드
        //main : t1합 + t2합 => 합 : 5050  => 문제 : join()
        SumThread thread1 = new SumThread(1, 50);
        SumThread thread2 = new SumThread(51, 100);

        thread1.start();
        thread2.start();

        try {
            // 대기
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("합계 :" + (thread1.getTotal() + thread2.getTotal()));

    }
}
