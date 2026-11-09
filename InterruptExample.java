package ch14.sec04;

public class InterruptExample {

    public static void main(String[] args)
            throws InterruptedException {

        Thread worker = new Thread(() -> {
            try {
                while (true) {
                    System.out.println("작업 중...");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                System.out.println("종료 요청 감지");
            } finally {
                System.out.println("정리 작업");
            }
        });

        worker.start();

        Thread.sleep(2000);
        worker.interrupt();
        worker.join();

        System.out.println("메인 종료");
    }
}