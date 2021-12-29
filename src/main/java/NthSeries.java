import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class NthSeries {
    public static String seriesSum(int n) {
        List<Integer> list = new ArrayList<>();
        double sum = 0;

        list.add(1);
        for (int i = 1; i <= n * 3 - 3; i += 3) {
            list.add(i + 3);
        }
        for (Integer integer : list) {
            sum += (double) 1 / (double) integer;
        }
        BigDecimal bd = new BigDecimal(sum).setScale(2, RoundingMode.HALF_UP);
        double output = bd.doubleValue();
        if (String.valueOf(output).length() < 4) {
            return output + "0";
        }
        return String.valueOf(output);
    }

    public static void main(String[] args) {
        assertEquals("1.77", NthSeries.seriesSum(9));
        assertEquals("1.57", NthSeries.seriesSum(5));
        assertEquals("1.94", NthSeries.seriesSum(15));
    }
}
