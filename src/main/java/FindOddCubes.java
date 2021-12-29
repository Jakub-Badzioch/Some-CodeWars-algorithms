import static org.junit.Assert.assertEquals;

public class FindOddCubes {
    public static int cubeOdd(int[] arr) {
        /**
         You start by cubing every number (n * n * n). Then add the numbers together IF they are odd numbers.
         Then return the sum of the odd numbers. So if your numbers are A, B and C:

         (A * A * A) = odd1
         (B * B * B) = even
         (C * C * C) = odd2

         Answer would be odd1 + odd2. **/
        int output = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i] * arr[i];
            if (arr[i] % 2 != 0) {
                output += arr[i];
            }
        }
        return output;
    }

    public static void main(String[] args) {
        assertEquals(0, FindOddCubes.cubeOdd(new int[]{-5, -5, 5, 5}));
        assertEquals(28, FindOddCubes.cubeOdd(new int[]{1, 2, 3, 4}));
        assertEquals(0, FindOddCubes.cubeOdd(new int[]{-3, -2, 2, 3}));
    }
}
