import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class JadenCase {
    public String toJadenCase(String phrase) {
        StringBuilder sb = new StringBuilder();
        List<Character> chars = new ArrayList<>();
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        for (char ch : phrase.toCharArray()) {
            chars.add(ch);
        }
        for (int i = 0; i < chars.size(); i++) {
            if (i == 0 || chars.get(i - 1) == ' ' && chars.get(i + 1) != ' ' && chars.get(i) != ' ') {
                sb.append(Character.toUpperCase(chars.get(i)));
            } else {
                sb.append(chars.get(i));
            }
        }
        return String.valueOf(sb);
    }

    public static void main(String[] args) {
        JadenCase jadenCase = new JadenCase();
        assertEquals("toJadenCase doesn't return a valide JadenCase String! try again please :)",
                "Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
        assertNull("Must return null when the arg is null", jadenCase.toJadenCase(null));
        assertNull("Must return null when the arg is empty string", jadenCase.toJadenCase(""));
    }
}