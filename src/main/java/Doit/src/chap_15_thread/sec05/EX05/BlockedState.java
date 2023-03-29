package chap_15_thread.sec05.EX05;

class MyBlockTest {
    // 공유 객체
    MyClass mc = new MyClass();
    // 3개의 쓰레드 필드 생성
    Thread t1 = new Thread("thread1") {
        public void run() {
            mc.syncMethod();
        }
    };
    Thread t2 = new Thread("thread2") {
        public void run() {
            mc.syncMethod();
        }
    };
    Thread t3 = new Thread("thread3") {
        public void run() {
            mc.syncMethod();
        }
    };

    void startAll() {
        t1.start();
        t2.start();
        t3.start();
    }

    class MyClass {
        synchronized void syncMethod() {
            try {Thread.sleep(100);} catch (InterruptedException e) {} // 쓰레드 준비 시간
            System.out.println("====" + Thread.currentThread().getName() + "====");
            System.out.println("thread1 -> " + t1.getState());
            System.out.println("thread1 -> " + t2.getState());
            System.out.println("thread1 -> " + t3.getState());
            for(long i = 0 ; i < 1000000000L ; i++) {} // 시간 지연
        }
    }
}

public class BlockedState {
    public static void main(String[] args) {
        // 객체 생성
        MyBlockTest mbt = new MyBlockTest();
        mbt.startAll();
    }
}
