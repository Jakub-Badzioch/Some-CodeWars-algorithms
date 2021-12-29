import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WhereIsMyParent {
    private static List<String> findAllMoms(String text) {
        List<String> moms = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                moms.add(String.valueOf(text.charAt(i)));
            }
        }
        Collections.sort(moms);
        return moms;
    }

    private static List<String> findAllKids(String text) {
        List<String> kids = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLowerCase(text.charAt(i))) {
                kids.add(String.valueOf(text.charAt(i)));
            }
        }
        return kids;
    }

    private static List<String> matchMomsWithKids(List<String> moms, List<String> kids) {
        List<String> momsWithKids = new ArrayList<>();
        for (String mom : moms) {
            StringBuilder sb = new StringBuilder();
            sb.append(mom);
            for (String kid : kids) {
                if (mom.toLowerCase().equals(kid)) {
                    sb.append(kid);
                }
            }
            momsWithKids.add(sb.toString());
        }
        return momsWithKids;
    }


    static String findChildren(final String text) {
        List<String> moms = findAllMoms(text);
        List<String> kids = findAllKids(text);
        List<String> momsWithKids = matchMomsWithKids(moms, kids);
        return String.join("", momsWithKids);
    }
}
