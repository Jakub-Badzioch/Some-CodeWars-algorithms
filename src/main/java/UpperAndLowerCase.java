import java.util.Locale;

public class UpperAndLowerCase {

    public static String solve(final String str) {
        int sumHasUppercase = 0;
        int sumHasLowercase = 0;
        for (char c : str.toCharArray()) {
            String password = String.valueOf(c);
            boolean hasLowercase = !password.equals(password.toUpperCase());
            if (hasLowercase) {
                sumHasLowercase += 1;
            } else {
                sumHasUppercase += 1;
            }
        }
        if (sumHasUppercase <= sumHasLowercase) {
            return str.toLowerCase(Locale.ROOT);
        }
        return str.toUpperCase(Locale.ROOT);
    }

    public static void main(String[] args) {

    }
}
