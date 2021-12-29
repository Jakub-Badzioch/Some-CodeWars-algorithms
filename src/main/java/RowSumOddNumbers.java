public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        // an=a1+(n−1)⋅r
        // int ax = a1 + (x - 1) * r; // x-ty wyraz ciągu
        int output = 0;
        int x = 0;// numer wyrazu ciągu
        int a1 = 1; // pierwszy wyraz ciągu
        int r = 2; // różnica miedzy liczbami

        for (int i = 0; i < n; i++) {
            x += i;
        }
        x += 1;

        for (int j = x; j <= x + n - 1; j++) {
            output += a1 + (j - 1) * r; // suma wyrazów ciągu podstawy piramidy
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(1));
        System.out.println(rowSumOddNumbers(2));
        System.out.println(rowSumOddNumbers(42));
    }
}
