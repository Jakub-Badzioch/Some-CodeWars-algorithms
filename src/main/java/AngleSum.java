import static org.junit.Assert.assertEquals;

public class AngleSum {
    public static int sumOfAngles(int n) {
        return (n - 2) * 180;
    }

    public static void main(String[] args) {
        assertEquals(180, AngleSum.sumOfAngles(3));
        assertEquals(360, AngleSum.sumOfAngles(4));
    }
}
