package ch15.sec02;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        System.out.println(numbers.get(1));

        numbers.set(0, 99);

        numbers.remove(Integer.valueOf(20));
        numbers.remove(1);

        System.out.println(numbers);
        System.out.println(numbers.size());
    }
}
