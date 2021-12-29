import static org.junit.Assert.assertEquals;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        int count = 0;
     char[] roadElements = road.toCharArray();
        for (char roadElement : roadElements) {
            if (roadElement == 'n') {
                count += 1;
            }
        }

        if (count <= 15 ){
            return "Woohoo!";
        }
        return "Car Dead";
    }

    public static void main(String[] args) {
        assertEquals(BumpsTheRoad.bumps("n"), "Woohoo!");
        assertEquals(BumpsTheRoad.bumps("_nnnnnnn_n__n______nn__nn_nnn"), "Car Dead");
        assertEquals(BumpsTheRoad.bumps("______n___n_"), "Woohoo!");
        assertEquals(BumpsTheRoad.bumps("nnnnnnnnnnnnnnnnnnnnn"), "Car Dead");
    }
}
