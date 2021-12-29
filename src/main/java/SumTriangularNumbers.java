import static org.junit.Assert.assertEquals;

public class SumTriangularNumbers {
    public static int sumTriangularNumbers(int n) {
        if (n <= 0) {
            return 0;
        }

        int out = 0;
        for (int i = 1; i <= n; i++) {
            out += (i * (i + 1)) / 2;
        }

        return out;
    }

    public static void main(String[] args) {
        assertEquals(56, SumTriangularNumbers.sumTriangularNumbers(6));
        assertEquals(7140, SumTriangularNumbers.sumTriangularNumbers(34));
        assertEquals(0, SumTriangularNumbers.sumTriangularNumbers(-291));
        assertEquals(140205240, SumTriangularNumbers.sumTriangularNumbers(943));
        assertEquals(0, SumTriangularNumbers.sumTriangularNumbers(-971));
    }
}
