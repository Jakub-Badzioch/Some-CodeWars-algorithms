import org.junit.Assert;

public class RemoveParentheses {
    public static String removeParentheses(final String str) {
/*      String s = str.substring(str.indexOf("("));
        StringBuilder sB = new StringBuilder(s);
        s = sB.reverse().toString();
        s = s.substring(s.indexOf(')'));
        sB = new StringBuilder(s);
        s = sB.reverse().toString();
        return str.replace(s, "");*/
        String updated = str.replaceAll("\\([^()]*\\)", "");
        if (updated.contains("(")) updated = removeParentheses(updated);
        return updated;
    }
}
