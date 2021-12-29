import java.util.Set;
import java.util.TreeSet;

public class TwoToOne {
    public static String longest(String s1, String s2) {
        Set<Character> set = new TreeSet<>();
        StringBuilder output = new StringBuilder();
        for (char c : (s1 + s2).toCharArray()) set.add(c);
        for (Character c : set) output.append(c);
        return output.toString();
    }
}
