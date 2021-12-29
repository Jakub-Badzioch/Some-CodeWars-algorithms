public class FindDivisor {
    public static long numberOfDivisors(int n) {
        long output = 0;
        for (int i = 1; i <= 500000; i++) {
            if (n == 0) {
                output += 0;
            } else if (n % i == 0) {
                output += 1;
            }
        }
        return output;
    }


    public static void main(String[] args) {
        System.out.println(numberOfDivisors(4) == 3); // 1, 2, 4
        System.out.println(numberOfDivisors(5) == 2); // 1, 5
        System.out.println(numberOfDivisors(12) == 6);  // 1, 2, 3, 4, 6, 12
        System.out.println(numberOfDivisors(30) == 8); // 1, 2, 3, 5, 6, 10, 15, 30
        System.out.println(numberOfDivisors(0));
    }
}
