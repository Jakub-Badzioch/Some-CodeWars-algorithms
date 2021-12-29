import java.util.Arrays;

public class RowWeightsSolution {
    public static int[] rowWeights(final int[] weights) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 1; i <= weights.length; i++) {
            if (i % 2 != 0) {
                sum1 += weights[i - 1];
            } else {
                sum2 += weights[i - 1];
            }
        }
        return new int[]{sum1, sum2};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rowWeights(new int[]{50, 60, 70, 80})));
    }
}
