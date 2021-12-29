import java.util.Arrays;
import java.util.Locale;

public class IsAnagram {
    public static boolean isAnagram(String test, String original) {

        char[] first = original.toLowerCase(Locale.ROOT).toCharArray();
        char[] second = test.toLowerCase(Locale.ROOT).toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first, second);
    }
}
