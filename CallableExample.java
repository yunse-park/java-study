package ch14.sec06;

import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args)
            throws Exception {

        ExecutorService executor =
                Executors.newFixedThreadPool(2);

        try {
            Callable<Integer> task = () -> {
                int sum = 0;

                for (int i = 1; i <= 100; i++) {
                    sum += i;
                }

                return sum;
            };

            Future<Integer> result =
                executor.submit(task);

            System.out.println(
                "계산 결과: " + result.get()
            );
        } finally {
            executor.shutdown();
        }
    }
}