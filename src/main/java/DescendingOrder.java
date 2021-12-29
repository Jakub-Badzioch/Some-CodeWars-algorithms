import java.util.Arrays;

class Order {
    public static int sortDesc(final int num) {
        char[] c = String.valueOf(num).toCharArray();
        StringBuilder sb = new StringBuilder();
        Arrays.sort(c);
        for (int i = c.length - 1; i >= 0; i--) sb.append(c[i]);
        return Integer.parseInt(String.valueOf(sb));
    }
}
