public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p) {
        double previous = p0;
        int count = 0;

        do {
            previous = previous + previous * (percent / (double) 100) + (double) aug;
            count++;
        } while (previous < (double) p);

        return count;
    }
}
