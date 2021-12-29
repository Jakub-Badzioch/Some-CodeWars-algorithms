import java.util.*;

public class MaxSumDigits {
    private static List<Integer> numbers = new ArrayList<>();

    private static void combinations(int[] arr, int[] data, int start, int end, int index, int r) {
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
            combinations(arr, data, i + 1, end, index + 1, r);
        }
    }

    private static int biggestSumOfDigits(int num) {
        final char[] chars = String.valueOf(num).toCharArray();
        final int[] ints = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            ints[i] = Character.getNumericValue(chars[i]);
        }
        combinations(ints, new int[4], 0, ints.length - 1, 0, 4);
        int out = 0;
        for (Integer number : numbers) {
            if (number > out) out = number;
        }
        numbers = new ArrayList<>();
        return out;
    }

    private static List<Long> all(long nmax, int maxsm) {
        List<Long> nums = new ArrayList<>();
        for (int i = 1000; i <= nmax; i++) {
            if (biggestSumOfDigits(i) <= maxsm) {
                nums.add((long) i);
            }
        }
        return nums;
    }

    private static long closestToAverage(List<Long> nums, long sum) {
        long temp = Long.MAX_VALUE;
        long out = 0;
        for (Long num : nums) {
            long one = num;
            long average = sum / nums.size();
            long l = 0;
            if (one < average) l = average - one;
            if (one >= average) l = one - average;
            if (l < temp) {
                temp = l;
                out = num;
            }
        }
        return out;
    }

    public static long[] maxSumDig(long nmax, int maxsm) {
        final List<Long> nums = all(nmax, maxsm);
        long sum = 0;
        for (Long d : nums) sum += d;
        return new long[]{nums.size(), closestToAverage(nums, sum), sum};
    }
}
