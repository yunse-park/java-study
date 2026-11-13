package ch14.sec07;

import java.util.*;
import java.util.concurrent.*;

public class BankAccountThreadReview {

    static class Account {
        private int balance = 100000;

        public synchronized void deposit(int amount) {
            balance += amount;
        }

        public synchronized void withdraw(int amount) {
            balance -= amount;
        }

        public synchronized int getBalance() {
            return balance;
        }
    }

    public static void main(String[] args)
            throws Exception {

        Account account = new Account();

        ExecutorService executor =
                Executors.newFixedThreadPool(3);

        List<Future<?>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            results.add(executor.submit(() -> {
                account.deposit(1000);
            }));

            results.add(executor.submit(() -> {
                account.withdraw(1000);
            }));
        }

        executor.shutdown();

        for (Future<?> result : results) {
            result.get();
        }

        System.out.println(
            "최종 잔액: " + account.getBalance()
        );
    }
}