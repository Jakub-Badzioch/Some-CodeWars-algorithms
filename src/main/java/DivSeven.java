import static org.junit.Assert.assertArrayEquals;

public class DivSeven {
    public static String removeLastChar(String s) {
        return (s == null || s.length() == 0) ? null : (s.substring(0, s.length() - 1));
    }

    public static String removeEverythingExceptLastChar(String s) {
        return s.substring(s.length() - 1);
    }

    public static long[] seven(long m) {
        long variable = Long.parseLong(removeLastChar(String.valueOf(m)));
        long lastDigit = Long.parseLong(removeEverythingExceptLastChar(String.valueOf(m)));
        long count = 0;

        do {
            variable -= lastDigit * 2;
            count++;
        } while (variable >= 100 & variable % 7 == 0);

        return new long[]{variable, count};
    }

    public static void main(String[] args) {
        assertArrayEquals(new long[]{7, 2}, DivSeven.seven(1603));
    }
}
