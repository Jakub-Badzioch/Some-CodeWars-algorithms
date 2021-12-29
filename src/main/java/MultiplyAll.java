import static org.junit.Assert.assertArrayEquals;
@FunctionalInterface
interface ApplyInterface {
    int[] apply(int n);
}
public class MultiplyAll {
    public static ApplyInterface multiplyAll(int[] array) {
        return n -> {
            for (int i = 0; i < array.length; i++) {
                array[i] *= n;
            }
            return array;
        };
    }

    public static void main(String[] args) {
        assertArrayEquals(new int[0], MultiplyAll.multiplyAll(new int[0]).apply(10));
    }
}


/**
 * return new ApplyInterface() {
 *
 * @Override public int[] apply(int n) {
 * for (int i = 0; i < array.length; i++) {
 * array[i] *= n;
 * }
 * return array;
 * }
 * };
 **/