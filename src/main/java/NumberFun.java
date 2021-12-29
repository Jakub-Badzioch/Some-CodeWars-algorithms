
public class NumberFun {

    public static long findNextSquare(long sq) {
        double d = Math.sqrt(sq);
        if (d % 1 == 0) {
            long l = (long) (d + 1);
            l *= l;
            return l;
        }
        return -1;
    }

    public static void main(String[] args) {
        NumberFun.findNextSquare(121);
    }
}
