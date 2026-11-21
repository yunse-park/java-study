package ch15.sec06;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        queue.offer("고객 A");
        queue.offer("고객 B");
        queue.offer("고객 C");

        System.out.println("다음 고객: " + queue.peek());
        System.out.println("대기 인원: " + queue.size());

        while (!queue.isEmpty()) {
            System.out.println("처리: " + queue.poll());
        }

        System.out.println("남은 인원: " + queue.size());
    }
}