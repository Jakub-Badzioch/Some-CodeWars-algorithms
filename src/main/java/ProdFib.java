public class ProdFib {
    public static long[] productFib(long prod) {
        long a = 0L;
        long b = 1L;
        while (a * b < prod) {
            long boxForA = a;
            a = b;
            b = boxForA + b;
        }
        return new long[] { a, b, a * b == prod ? 1 : 0 };
    }
}