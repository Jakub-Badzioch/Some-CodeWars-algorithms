package AreSame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AreSame {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null) {
            return false;
        }

        List<Integer> alist = new ArrayList<>();
        List<Integer> blist = new ArrayList<>();

        for (int i : a) alist.add(i * i);
        for (int i : b) blist.add(i);

        Collections.sort(alist);
        Collections.sort(blist);

        return alist.equals(blist);
    }
}

/*         List<Boolean> booleans = new ArrayList<>();

        if (a.length != b.length) {
            return false;
        }
        for (int i : a) {
            for (int j : b) {
                if (i * i == j) {
                    booleans.add(true);
                }
            }
        }
        for (Boolean aBoolean : booleans) {
            return aBoolean;
        }
        return false; */
