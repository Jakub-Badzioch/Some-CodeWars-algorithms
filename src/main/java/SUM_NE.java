
public class SUM_NE {
    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        }

        int start = 0;
        int end = 0;
        if (a > b) {
            end = a;
            start = b;
        } else if (a < b) {
            end = b;
            start = a;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(GetSum(1, 0) == 1);   // 1 + 0 = 1
        System.out.println(GetSum(0, -1) == -1); // 0 + (-1) = - 1
        System.out.println(GetSum(0, -17));
    }
}
