package chap_15_thread.sec05.EX01;

public class NewRunnableTerminated {
    public static void main(String[] args) {
        // 쓰레드 상태 저장 클래스
        Thread.State state;

        // 1. 객체 생성(new)
        Thread myThread = new Thread() {
            @Override
            public void run() {
                for(long i = 0; i < 1000000000 ; i++) {} // 시간 지연
            }
        };
        state = myThread.getState();
        System.out.println("myThread state = " + state);

        // 2. myThread 시작
        myThread.start();
        state = myThread.getState();
        System.out.println("myThread state = " + state);

        // 3. myThread 종료
        try {
            myThread.join(); // myThread 실행이 완료될 때까지 main 쓰레드 일시 정지
        } catch (InterruptedException e) {}
        state = myThread.getState();
        System.out.println("myThread state = " + state);
    }
}
