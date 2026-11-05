package ch14.sec01;

public class WorkerThreadExample {
    public static void main(String[] args) {

        Thread worker = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("작업 스레드: " + i);
            }
        });

        worker.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("메인 스레드: " + i);
        }
    }
}