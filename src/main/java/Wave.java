import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Wave {
    public static String[] wave(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') continue;
            list.add(str.substring(0, i) + Character.toUpperCase(ch) + str.substring(i + 1));
        }
        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        wave("mexican wave");

    }
}
