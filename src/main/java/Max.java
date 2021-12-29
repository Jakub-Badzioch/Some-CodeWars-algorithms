public class Max {

    private static int sumOfElements(int[] arr, int start, int elements) {
        int sum = 0;
        do {
            sum += arr[start+elements-1];
            elements--;
        } while (elements > 0);

        return sum;
    }

    private static int biggestSubsequenceOfXElements(int[] arr, int elements) {
        int sum = 0;
        for (int i = 0; i <= arr.length - elements; i++) {
            int maybeSum = sumOfElements(arr, i, elements);
            if (sum < maybeSum) sum = maybeSum;
        }
        return sum;
    }

    public static int sequence(int[] arr) {
        int sum = 0;
        for (int i = 1; i <= arr.length; i++) {
            int maybeSum = biggestSubsequenceOfXElements(arr, i);
            if (sum < maybeSum) sum = maybeSum;
        }
        return sum;
    }
}