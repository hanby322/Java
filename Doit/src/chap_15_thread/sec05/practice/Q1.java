package chap_15_thread.sec05.practice;

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5 ; i++) {
            try{Thread.sleep(1000);} catch (InterruptedException e) {}
            System.out.println(i + "초");
        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
//        MyThread t1 = new MyThread(); // 가능
        t1.start();
    }
}
