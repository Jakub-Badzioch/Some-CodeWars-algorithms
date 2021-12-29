package Abbreviator;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Abbreviator {
    public static String insideLettersToNumbers(String sg) {
        sg = sg.toLowerCase(Locale.ROOT);
        return String.valueOf(sg.charAt(0)) + (sg.length() - 2) + sg.charAt(sg.length() - 1);
    }

    public static List<String> statementToListOfWords(String sg) {
        return Arrays.asList(sg.split("\\W+"));
    }

    public static String abbreviate(String string) {
        StringBuilder sb = new StringBuilder();

        // TODO znajdź jaki jest znak i w którym słowie się on znajduje
        for (String s : statementToListOfWords(string)) {
            if (s.length() > 3) {
                sb.append(insideLettersToNumbers(s)).append(" ");
            } else {
                sb.append(s).append(" ");
            }
            if (s.equals(statementToListOfWords(string).get(0))) {
                sb = new StringBuilder(sb.toString().trim());
                sb.append("-");
            }
            if (s.equals(statementToListOfWords(string).get(4))) {
                sb = new StringBuilder(sb.toString().trim());
                sb.append("!");
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(abbreviate("elephant-rides are really fun!"));
    }
}
