package SampleP;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static String simpleTransposition(String text) {
        List<String> row1 = new ArrayList<>();
        List<String> row2 = new ArrayList<>();
        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < chars.length; i++) {
            if (i % 2 == 0) {
                row1.add(String.valueOf(chars[i]));
            } else row2.add(String.valueOf(chars[i]));
        }

        for (String s : row1) {
            sb.append(s);
        }
        for (String s : row2) {
            sb.append(s);
        }

        return sb.toString();
    }
}
