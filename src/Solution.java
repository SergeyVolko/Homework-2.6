import java.util.*;

public class Solution {

    private static final String DELIMITER = "=".repeat(50);
    public static void task1(List<Integer> numbers) {
        System.out.println("task1");
        StringJoiner joiner = new StringJoiner(" ");
        for (Integer num : numbers) {
            if (num % 2 != 0) {
                joiner.add(num.toString());
            }
        }
        System.out.println(joiner);
        System.out.println(DELIMITER);
    }

    public static void task2(List<Integer> numbers) {
        System.out.println("task2");
        StringJoiner joiner = new StringJoiner(" ");
        Set<Integer> set = new HashSet<>();
        for (Integer i : numbers) {
            if (i % 2 == 0) {
                set.add(i);
            }
        }
        List<Integer> res = new ArrayList<>(set);
        Collections.sort(res);
        for (Integer i : res) {
            joiner.add(i.toString());
        }
        System.out.println(joiner);
        System.out.println(DELIMITER);
    }

    public static void task3(String text) {
        System.out.println("task3");
        StringJoiner joiner = new StringJoiner(" ");
        Set<String> strings = new HashSet<>(Arrays.asList(text.split(" ")));
        for (String word : strings) {
            joiner.add(word);
        }
        System.out.println(joiner);
        System.out.println(DELIMITER);
     }

     public static void task4(List<String> strings) {
         System.out.println("task4");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strings) {
            map.putIfAbsent(s, 0);
            map.put(s, map.get(s) + 1);
        }
        for (Integer i : map.values()) {
            System.out.println(i);
        }
         System.out.println(DELIMITER);
     }
}
