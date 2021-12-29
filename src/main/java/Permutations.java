import java.util.List;

public class Permutations {

    public static void permutate(List<Integer> nums, int first, int last) {
        if (first == last) {
            System.out.println(nums.get(first));
        }
        for (int i = first; i <= last; i++) {
            nums.set(i, nums.get(first));
            nums.set(first, nums.get(i));
            int temp = nums.get(i);
            permutate(nums, first + 1, last);
            temp = nums.get(first);
            nums.set(first, nums.get(i));
            temp = nums.get(i);
        }
    }

    public static void main(String[] args) {
        permutate(List.of(1, 2, 3), 0, 2);
    }
}
