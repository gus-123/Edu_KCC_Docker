package kosa.oop4;

public class MyThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        MyThread my = new MyThread();
        Thread t = new Thread(my);
        t.start();
    }
}
