package ch14.sec02;


public class ThreadNameExample {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());

        Thread worker = new Thread(() -> {
            System.out.println(
                Thread.currentThread().getName()
            );
        });

        worker.setName("Worker-1");
        worker.start();
    }
}