public class Validator {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}|\\d{6}");
    }

    public static boolean isDigit(String s) {
        return s.matches("\\d");
    }

    public static boolean isHexNumber(String s) {
        return s.toLowerCase().matches("(0x)?[\\d a-f]+");
    }

    public static boolean eightBitNumber(String n) {
        return n.matches("[1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5]");
// return n.matches("[0-9]{1,3}");
    }

    public static int[] solve(int a, int b) {
        return a == 0 | b == 0 ? new int[]{a, b} : a >= 2 * b ? solve(a - 2 * b, b) : b >= 2 * a ? solve(a, b - 2 * a) :
                new int[]{a, b};
    }


    public static int compute(int x, int y) {
        if (x % y == 0) return y;
        return compute(y, x % y);
    }

    public static void main(String[] args) {

    }
}
