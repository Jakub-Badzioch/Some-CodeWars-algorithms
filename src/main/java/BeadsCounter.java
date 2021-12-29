public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
        if (nBlue < 2) return 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nBlue; i++) {
            sb.append(1);
            sb.append(" ");
        }
        String str = sb.toString().trim().replaceAll(" ", "0");
        int output = 0;
        for (char c : str.toCharArray()) {
            if (c == '0') {
                output++;
            }
        }
        return output *2;
    }
}
