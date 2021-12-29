import java.util.ArrayList;
import java.util.List;

public class gg {

    private static List<Integer> numbers = new ArrayList<>();

    static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r) {
        int sum = 0;
        if (index == r) {
            for (int j = 0; j < r; j++) {
                sum += data[j];
            }
            numbers.add(sum);
            return;
        }
        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1};
        combinationUtil(arr, new int[4], 0, arr.length - 1, 0, 4);
        System.out.println(numbers);
    }
}
