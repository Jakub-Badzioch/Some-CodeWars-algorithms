

/**
 * Task:
 * The goal of this exercise is to convert a string to a new string where each character in the new string is "("
 * if that character appears only once in the original string, or ")" if that character appears more than once in the
 * original string. Ignore capitalization when determining if a character is a duplicate.
 * <p>
 * Examples:
 * "din"      =>  "((("
 * "recede"   =>  "()()()"
 * "Success"  =>  ")())())"
 * "(( @"     =>  "))(("
 * <p>
 * Notes:
 * Assertion messages may be unclear about what they display in some languages.
 * If you read "... It Should encode XXX", the "XXX" is the expected result, not the input!
 */


import java.util.*;

class DuplicateEncoder {

    static String encode(String word) {
        char[] chars = word.toLowerCase().toCharArray();
        word = "";
        Map<Character, Integer> map = new HashMap<>();

        for (char letter : chars) {
            if (!map.containsKey(letter)) {
                map.put(letter, 1);
            } else {
                int lastValue = map.get(letter);
                map.put(letter, lastValue + 1);
            }
        }

        StringBuilder wordBuilder = new StringBuilder(word);
        for (char letter : chars) {
            // get() bierze klucz i zwraca wartość
            if (map.containsKey(letter) && map.get(letter) > 1) {
                wordBuilder.append(")");
            } else {
                wordBuilder.append("(");
            }
        }
        word = wordBuilder.toString();
        return word;
    }


    public static void main(String[] args) {
        System.out.println(encode("din"));
        System.out.println(encode("recede"));
        System.out.println(encode("Success"));
        System.out.println(encode("(( @"));

    }
}

// expected:<[)()()])()(()()(> but was:<[(()((])()(()()(>