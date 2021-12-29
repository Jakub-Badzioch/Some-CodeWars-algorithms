public class GFG {
    static int najwiekszyWspolnyDzielnik(int a, int b) {
        int c;
        while (a != 0) {
            c = a;
            a = b % a;
            b = c;
        }
        return b;
    }

    static void forbenius(int moneta1, int moneta2) {
        /*Dwie monety mają przynajmniej jedną niemożliwą do uzyskania kwotę jeśli największy wspólny dzielnik jest równy 1 */
        if (najwiekszyWspolnyDzielnik(moneta1, moneta2)==1) {
            int A = (moneta1 * moneta2) - (moneta1 + moneta2);
            int N = (moneta1 - 1) * (moneta2 - 1) / 2;

            System.out.println("Największa kwota, której nie można uzyskać przy użyciu podanych dwóch monet: " + A);
            System.out.println("Ilość niemożliwych do uzyskania kwot: " + N);
        } else {
            System.out.println("NA");
        }
    }

    public static void main(String[] args) {
        int X = 2,Y = 5;
        forbenius(X, Y);
        System.out.println();
        X = 5; Y = 10;
        forbenius(X, Y);
    }
}
