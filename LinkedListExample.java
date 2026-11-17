package ch15.sec02;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();

        names.add("Kim");
        names.add("Lee");
        names.add("Park");

        names.addFirst("Choi");
        names.addLast("Jung");

        System.out.println(names);
        System.out.println(names.get(2));

        names.removeFirst();
        names.removeLast();

        System.out.println(names);
    }
}
