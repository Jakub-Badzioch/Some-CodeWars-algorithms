public class SgR {
    public static String repeatStr(final int repeat, final String string) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (count < repeat) {
            sb.append(string);
            count++;
        }
        return sb.toString();
    }
}
