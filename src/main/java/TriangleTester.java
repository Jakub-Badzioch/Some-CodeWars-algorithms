import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TriangleTester {
    public static boolean isTriangle(int a, int b, int c) {
        return b + c > a & b + a > c & c + a > b;
    }

    public static void main(String[] args) {
        assertTrue(TriangleTester.isTriangle(1, 2, 2));
        assertFalse(TriangleTester.isTriangle(7, 2, 2));
    }
}
