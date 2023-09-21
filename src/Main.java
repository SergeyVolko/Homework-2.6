import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Solution.task1(nums);
        Solution.task2(nums);
        String text = "один два два три три три";
        Solution.task3(text);
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        Solution.task4(strings);
    }
}