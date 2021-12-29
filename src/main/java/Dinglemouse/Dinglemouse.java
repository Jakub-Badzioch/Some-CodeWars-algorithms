package Dinglemouse;

import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {
/*    public static String removeSpaces(String town) {
        StringBuilder sb = new StringBuilder();

        for (char c : town.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static List<Character> strToCharList(String town) {
        List<Character> chars = new ArrayList<>();

        for (char c : removeSpaces(town).toCharArray()) {
            chars.add(c);
        }

        return chars;
    }

    public static int countDeafRats(final String town) {
        int output = 0;
        List<Character> rats = strToCharList(town);

        for (int i = 0; i < rats.size(); i += 2) {
            if (rats.get(i).equals('O')) {
                output++;
            }
        }

        return output;
    }*/


    public static int countDeafRats(final String town) {
/*        String t = town.replaceAll(" ", "");
        int deafRats = 0;
        for (int i = 0; i < t.length(); i+=2) {
            if (t.charAt(i) == '0') {
                deafRats ++;
            }
        }
        return deafRats;*/

        String t = town.replaceAll(" ", "");
        int deafRats = 0;
        for (int i = 0; i < t.length(); i+=2) {
            if (t.charAt(i) == '0') {
                deafRats ++;
            }
        }
        return deafRats;
    }
    public static void main(String[] args) {
        Dinglemouse.countDeafRats("~O~O~O~O P");
        Dinglemouse.countDeafRats("P O~ O~ ~O O~");
        Dinglemouse.countDeafRats("~O~O~O~OP~O~OO~");
    }
}
