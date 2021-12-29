import java.util.ArrayList;
import java.util.List;

public class VolTank {

    private static int iterPlus(int[] arr, int start, int end) {
        List<Integer> listToSummation = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            listToSummation.add(arr[i]);
        }
        return listToSummation.stream().mapToInt(Integer::intValue).sum();
    }

    private static int iterMinus(int[] arr, int start) {
        List<Integer> listToSummation = new ArrayList<>();
        for (int i = start; i >= 0; i--) {
            listToSummation.add(arr[i]);
        }
        return listToSummation.stream().mapToInt(Integer::intValue).sum();
    }

    public static int findEvenIndex(int[] arr) {
        final int after0 = iterPlus(arr, 1, arr.length - 1);
        if (after0 == 0) return 0;

        for (int i = 1; i < arr.length ; i++) {
            int beforeiSum = iterMinus(arr, i - 1);
            int afteriSum = iterPlus(arr, i + 1, arr.length - 1);
            if (beforeiSum == afteriSum) return i;
        }
        return -1;
    }

}
