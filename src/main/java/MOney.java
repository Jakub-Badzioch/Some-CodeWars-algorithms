import static org.junit.Assert.assertEquals;

public class MOney {
    /**
     * P - Kapitał
     * D - Oczekiwana suma
     * Y - Lata niebędne do osiągnięcia oczekiwanej sumy D
     * I - Odsetki opłacane rocznie
     * T - podatek
     */
    public static int calculateYears(double principal, double interest, double taxRate, double desired) {
        if (principal == desired) {
            return 0;
        }

        for (int i = 0; true; i++) {
            if (principal >= desired) {
                return i;
            }

            double brutto = principal * interest;
            double tax = brutto * taxRate;
            double netto = brutto - tax;
            principal += netto;
        }
    }

    public static void main(String[] args) {
        System.out.println(MOney.calculateYears(1000, 0.01625, 0.18, 1200));
    }
}
