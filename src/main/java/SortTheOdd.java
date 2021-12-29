import java.util.*;

public class SortTheOdd {

    private static int[] retrieveAllOddNumbersInAscendingOrder(int[] array) {
        return Arrays.stream(array)
                .filter(el -> el % 2 == 1)
                .sorted()
                .toArray();
    }

    /*public static int[] oddsInAscendingOrder(int[] array) {
        array = deleteAllEvens(array);
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }*/

    public static int[] sortArray(int[] array) {
        final int[] odds = retrieveAllOddNumbersInAscendingOrder(array);
        int oddsIterator = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = odds[oddsIterator];
                oddsIterator++;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortArray(new int[]{5, 3, 2, 8, 1, 4})));
    }
}
