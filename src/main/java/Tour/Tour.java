package Tour;
import javax.transaction.xa.Xid;
import java.util.HashMap;
import java.util.Map;
public class Tour {
    public static Map<String, String> arrToMap(String[][] ftwns){
        Map<String, String> hashMap = new HashMap<>();
        for (String[] ftwn : ftwns) hashMap.put(ftwn[0], ftwn[1]);
        return hashMap;
    }
    public static int tour(String[] arrFriends, String[][] ftwns, Map<String, Double> h) {
        for (int i = 1; i <= 4; i++) {
            String s = arrToMap(ftwns).get("X" + i);
            Double q = h.get(s);

        }
        return 1;
    }
}
