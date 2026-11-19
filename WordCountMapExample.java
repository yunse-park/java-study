package ch15.sec04;

import java.util.HashMap;
import java.util.Map;

public class WordCountMapExample {
    public static void main(String[] args) {

        String[] words = {
            "java", "sql", "java",
            "spring", "sql", "java"
        };

        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.put(
                word,
                counts.getOrDefault(word, 0) + 1
            );
        }

        System.out.println("java: " + counts.get("java"));
        System.out.println("sql: " + counts.get("sql"));
        System.out.println("spring: " + counts.get("spring"));
    }
}