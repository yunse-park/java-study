package ch15.sec05;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> scores = new TreeSet<>();

        scores.add(50);
        scores.add(20);
        scores.add(10);
        scores.add(40);
        scores.add(30);
        scores.add(20);

        System.out.println(scores);

        System.out.println("최솟값: " + scores.first());
        System.out.println("최댓값: " + scores.last());

        System.out.println("30 미만: " + scores.lower(30));
        System.out.println("30 이하: " + scores.floor(30));
        System.out.println("35 이상: " + scores.ceiling(35));
        System.out.println("40 초과: " + scores.higher(40));

        System.out.println(
            "20 이상 50 미만: "
            + scores.subSet(20, true, 50, false)
        );

        System.out.println(
            "내림차순: " + scores.descendingSet()
        );
    }
}
