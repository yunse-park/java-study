package ch15.sec04;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> scores = new HashMap<>();

        scores.put("Kim", 90);
        scores.put("Lee", 85);
        scores.put("Park", 95);

        System.out.println(scores.get("Kim"));
        System.out.println(scores.size());

        // 같은 Key에 새로운 Value 저장
        scores.put("Kim", 100);

        System.out.println(scores.get("Kim"));
        System.out.println(scores.containsKey("Lee"));

        // Key와 Value를 함께 출력
        for (Map.Entry<String, Integer> entry
                : scores.entrySet()) {

            System.out.println(
                entry.getKey() + ": " + entry.getValue()
            );
        }
    }
}
