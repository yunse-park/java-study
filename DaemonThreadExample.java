package ch14.sec05;

public class DaemonThreadExample {

    public static void main(String[] args)
            throws InterruptedException {

        Thread worker = new Thread(() -> {
            while (true) {
                System.out.println("자동 저장 중...");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    return;
                }
            }
        });

        worker.setDaemon(true);
        worker.start();

        System.out.println("데몬 여부: " + worker.isDaemon());

        Thread.sleep(1600);
        System.out.println("메인 스레드 종료");
    }
}