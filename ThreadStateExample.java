package ch14.sec02;


public class ThreadStateExample {
    public static void main(String[] args)
            throws InterruptedException {

        Thread worker = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        System.out.println("생성: " + worker.getState());

        worker.start();
        Thread.sleep(100);

        System.out.println("대기 중: " + worker.getState());

        worker.join();

        System.out.println("종료: " + worker.getState());
    }
}

