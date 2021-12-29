public class LongestConsec {
    private static String concat(String[] strarr, int first, int last) {
        StringBuilder sb = new StringBuilder();
        for (int i = first; i <= last; i++) {
            sb.append(strarr[i]);
        }
        return sb.toString();
    }

    public static String longestConsec(String[] strarr, int k) {
        int actualLength = -1;
        String actualLongest = "";
        for (int i = 0; i <= strarr.length - k; i++) {
            final String concat = concat(strarr, i, i + k - 1);
            if (concat.length() > actualLength) {
                actualLength = concat.length();
                actualLongest = concat;
            }
        }
        return actualLongest;
    }
}