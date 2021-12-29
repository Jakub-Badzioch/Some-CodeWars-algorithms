import java.util.Scanner;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

public class Codeforces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // lambdy
        final IntFunction<Boolean> isOdd = (int n) -> n % 2 == 0;

        final IntFunction<Boolean> isPrime = (int n) -> {

            int i = 2;
            boolean flag = false;
            while (i <= n / 2) {
                if (n % i == 0) {
                    flag = true;
                    break;
                }
                ++i;
            }

            return !flag;

        };

        final IntFunction<Boolean> isPalindrome = (int n) -> {

            int r, sum = 0, temp;
            temp = n;
            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            return temp == sum;

        };
        // koniec
        int sequences = scanner.nextInt();
        for (int i = 0; i < sequences + 1; i++) {
            int whatToDo = scanner.nextInt();
            int num = scanner.nextInt();
            final IntConsumer consumer = (int n) -> {

                if (n == 1) {
                    isOdd.apply(num);
                }
                if (n == 2) {
                    isPrime.apply(num);
                }
                if (n == 3) {
                    isPalindrome.apply(num);
                }

            };

            consumer.accept(whatToDo);
        }
    }
}
