package ch14.sec01;

public class MainThreadExample {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();

        System.out.println("현재 스레드: " + mainThread.getName());

        for (int i = 1; i <= 5; i++) {
            System.out.println("작업 " + i);
        }
    }
}