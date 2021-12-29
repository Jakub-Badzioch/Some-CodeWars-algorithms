import static org.junit.Assert.assertEquals;

@FunctionalInterface
interface RepeaterInterface {
    String repeater();
}

public class Repeater {
    public static String repeat(String string, long n) {
        RepeaterInterface repeater = () -> {
            StringBuilder output = new StringBuilder(string);
            for (int i = 1; i < n; i++) {
                output.append(string);
            }
            return output.toString();
        };

        return repeater.repeater();
    }

    public static void main(String[] args) {
        assertEquals("aaaaa", Repeater.repeat("a", 5));
        assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa", Repeater.repeat("Na", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ", Repeater.repeat("Wub ", 6));
    }
}
