import java.util.ArrayList;
import java.util.List;


public class StockList {

    private static int findNumber(String s) {
        s = s.replaceAll("[^0-9]+", " ");
        final String[] list = s.trim().split(" ");
        StringBuilder preoutput = new StringBuilder();
        for (String s1 : list) {
            preoutput.append(s1);
        }
        return Integer.parseInt(preoutput.toString());
    }

    public static String stockSummary(String[] arts, String[] letters) {
        if (arts.length == 0 | letters.length == 0) return "";

        List<String> preOutput = new ArrayList<>();

        for (String actual : letters) {
            int sumOfBooks = 0;
            for (String s1 : arts) {
                String verified = String.valueOf(s1.charAt(0));
                if (actual.equals(verified)) sumOfBooks += findNumber(s1);
            }
            preOutput.add("(" + actual + " : " + sumOfBooks + ")");
        }
        return String.join(" - ", preOutput);
    }
}
