package Xbonacci;

import java.util.Arrays;

public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
/*        double[] output = Arrays.copyOf(s, n);
        for (int i = 3; i < n; i++) {
            output[i] = output[i - 1] + output[i - 2] + output[i - 3];
        }
        return output;*/


        double[] r = new double[n];
        for(int i = 0; i < n; i++){
            // TODO Zapytać sie co to znaczy
            r[i] = (i<3)?s[i]:r[i-3]+r[i-2]+r[i-1];
        }
        return r;
    }
}
