package ch14.sec06;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExample {
    public static void main(String[] args)
            throws InterruptedException {

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 5; i++) {
            final int taskNo = i;

            executor.execute(() -> {
                String name =
                    Thread.currentThread().getName();

                System.out.println(
                    "작업 " + taskNo + " : " + name
                );
            });
        }

        executor.shutdown();
        executor.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println("작업 처리 확인 완료");
    }
}