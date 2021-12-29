package Opstrings1;

import java.util.ArrayList;
import java.util.List;


@FunctionalInterface
interface MyInterface {
    String oper(String s);
}

public class Opstrings1 {
    public static String reverseString(String str) {
        char[] ch = str.toCharArray();
        StringBuilder rev = new StringBuilder();
        for (int i = ch.length - 1; i >= 0; i--) {
            rev.append(ch[i]);
        }
        return rev.toString();
    }

    public static String insertPeriodically(String text, String insert, int period) {
        StringBuilder builder = new StringBuilder(text.length() + insert.length() * (text.length() / period) + 1);
        int index = 0;
        String prefix = "";
        while (index < text.length()) {
            builder.append(prefix);
            prefix = insert;
            builder.append(text, index, Math.min(index + period, text.length()));
            index += period;
        }
        return builder.toString();
    }

    public static int periodFinder(String strng) {
        List<String> list = new ArrayList<>();
        int count = 0;
        for (char c : strng.toCharArray()) {
            list.add(String.valueOf(c));
        }
        for (String s : list) {
            if (s.contains("\n")) {
                return count;
            }
            count++;
        }
        return 1;
    }

    public static String rot(String strng) {
        return insertPeriodically(reverseString(strng.replaceAll("\n", "")), "\n", periodFinder(strng));
    }

    public static String selfieAndRot(String strng) {
        StringBuilder dots = new StringBuilder("$1");
        dots.append(".".repeat(Math.max(0, periodFinder(strng))));
        String firstPart = strng.replaceAll("(.{" + periodFinder(strng) + "})", dots.toString()).trim();
        String secondPart = rot(strng.replaceAll("(.{" + periodFinder(strng) + "})", dots.toString()).trim());
        return firstPart + "\n" + secondPart;
    }

    public static String oper(MyInterface operator, String s) {
        return operator.oper(s);
    }
}
