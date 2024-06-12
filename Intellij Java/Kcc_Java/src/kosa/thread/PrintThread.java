package kosa.thread;

public class PrintThread extends Thread {
    SharedArea sharedArea;

    public PrintThread() {}

    public PrintThread(SharedArea sharedArea) {
        this.sharedArea = sharedArea;
    }

    public void run() {
        for (int cnt = 0; cnt < 3; cnt++) {
            // 동기화 블록
            synchronized (sharedArea) {
                int sum = sharedArea.account1.balance +
                        sharedArea.account2.balance;
                System.out.println("계좌 잔액 합계 :" + sum);
            }
            try {
                Thread.sleep(1);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
