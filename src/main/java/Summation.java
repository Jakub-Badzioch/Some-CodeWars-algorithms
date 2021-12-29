public class Summation {
    public static int summation(int n) {
        int num = 0;
        for (int i = 0; i <= n; i++) {
            num += i;
        }
        return num;
    }

    public static void main(String[] args) {

        System.out.println(summation(2));
        System.out.println(summation(8));
    }
}

