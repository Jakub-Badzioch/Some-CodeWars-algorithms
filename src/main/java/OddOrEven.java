public class OddOrEven {
    public static String oddOrEven(int[] array) {
        int num = 0;

        for (int i : array) {
            num += i;
        }

        String str;

        if (num % 2 == 0) {
            str = "even";
        } else {
            str = "odd";
        }

        return str;
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[]{2, 5, 34, 6}));
    }
}
