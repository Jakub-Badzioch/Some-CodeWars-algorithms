import java.util.Arrays;

public class Solution {
    public static String[] capitalize(String s) {

        char[] x = s.toCharArray();
        for (int j = 0; j < s.length(); j++) {
            if (j % 2 == 0) {
                x[j] = Character.toUpperCase(x[j]);
            } else {
                x[j] = Character.toLowerCase(x[j]);
            }
        }
        String[] results = new String[2];
        results[0] = String.valueOf(x);


        for (int k = 0; k < s.length(); k++) {
            if (k % 2 == 0) {
                x[k] = Character.toLowerCase(x[k]);
            } else {
                x[k] = Character.toUpperCase(x[k]);
            }
        }
        results[1] = String.valueOf(x);

        return results;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitalize("codewars")));
    }
}
