import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class PangramChecker {

    public boolean check(String sentence) {
        Set<Character> set = new TreeSet<>();
        StringBuilder sb = new StringBuilder();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        sentence = sentence
                .toLowerCase(Locale.ROOT)
                .replaceAll("[^a-z_-]", "");
        for (char c : sentence.toCharArray()) set.add(c);
        for (char c : set) sb.append(c);
        sentence = sb.toString();
        for (int i = 0; i < alphabet.length; i++) if (alphabet[i] != sentence.toCharArray()[i]) return false;
        return true;
    }
}
