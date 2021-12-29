import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Largestpairsuminarray {

    public static int largestNumFinder(List<Integer> numbers) {
        int output = -2147483648;
        for (int number : numbers) {
            if (number > output) output = number;
        }
        return output;
    }

    public static int largestPairSum(int[] numbers) {
        int one;
        int two;
        List<Integer> nums = new ArrayList<>();
        for (int number : numbers) {
            nums.add(number);
        }
        one = largestNumFinder(nums);
        nums.remove((Integer) one);
        two = largestNumFinder(nums);
        return one + two;
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int i1 = 0; i1 < numbers.length; i1++) {
                if (numbers[i] + numbers[i1] == target) {
                    return new int[]{i, i1};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        assertEquals("Failed test case [-100, -29, -24, -19, 19]:", 0, Largestpairsuminarray.largestPairSum(new int[]{-100, -29, -24, -19, 19}));
        assertEquals("Failed test case [-10, -8, -16, -18, -19]:", -18, Largestpairsuminarray.largestPairSum(new int[]{-10, -8, -16, -18, -19}));
    }
}
