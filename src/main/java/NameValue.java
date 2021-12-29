import java.util.*;

import static org.junit.Assert.assertArrayEquals;

public class NameValue {
    static Map<Character, Integer> alphabetMap() {
        Map<Character, Integer> alphabetMap = new HashMap<>();
        List<Character> alphabet = new ArrayList<>();
        char c;

        for (c = 'a'; c <= 'z'; ++c) {
            alphabet.add(c);
        }
        for (int i = 0; i < 26; i++) {
            alphabetMap.put(alphabet.get(i), i + 1);
        }

        return alphabetMap;
    }

    static int preOutputsMaker(String str) {
        Map<Character, Integer> alphabetMap = alphabetMap();
        str = str.replaceAll(" ", "");
        int count = 0;
        for (char c : str.toCharArray()) {
            count += alphabetMap.get(c);
        }

        return count;
    }

    static int[] nameValue(String[] arr) {
        List<Integer> list = new ArrayList<>();
        for (String s : arr) {
            list.add(preOutputsMaker(s));
        }
        int[] output = new int[list.size()];
        for (int i = 1; i <= list.size(); i++) {
            output[i - 1] = list.get(i - 1) * i;
        }

        return output;
    }

    public static void main(String[] args) {
        assertArrayEquals(new int[]{6, 24}, NameValue.nameValue(new String[]{"abc", "abc abc"}));
        assertArrayEquals(new int[]{88, 12, 225}, NameValue.nameValue(new String[]{"codewars", "abc", "xyz"}));
        assertArrayEquals(new int[]{351, 282, 330}, NameValue.nameValue(new String[]{"abcdefghijklmnopqrstuvwxyz", "stamford bridge", "haskellers"}));
    }
}
