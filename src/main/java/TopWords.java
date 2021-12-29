import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class TopWords {

    public static List<String> top3(String s) {
        s = s
                .toLowerCase(Locale.ROOT)
                .replace("#", "")
                .replace("\\", "")
                .replace("/", "")
                .replace(".", "");
        // If a text contains fewer than three unique words, then either the top-2 or top-1 words should be returned,
        // or an empty array if a text contains no words.
        List<String> list = Arrays.asList(s.split(" "));
        if (list.size() <= 3){
            return list;
        }
        return null;
    }
}
