import java.util.ArrayList;
import java.util.List;

public class Euler {
    public static void main(String[] args) {
        findBiggestProductOf4("08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08");
    }


    private static int findBiggestProductOf4(String numbers){
        List<Integer> nums = refractorToListOfNums(numbers);
        int output = 0;
        for (int i = 0; i < nums.size() - 3; i++) {
            int sum = nums.get(i) * nums.get(i+1) * nums.get(i+2) * nums.get(i+3);
            if (output < sum) output = sum;
        }
        System.out.println(output);
        return output;
    }

    private static List<Integer> refractorToListOfNums(String numbers) {
        List<String> list = getParts(numbers.replaceAll(" ", ""));
        List<Integer> nums = new ArrayList<>();
        for (String s : list) nums.add(Integer.valueOf(s));
        return nums;
    }

    private static List<String> getParts(String string) {
        List<String> parts = new ArrayList<>();
        for (int i = 0; i < string.length(); i += 2) parts.add(string.substring(i, Math.min(string.length(), i + 2)));
        return parts;
    }
}
