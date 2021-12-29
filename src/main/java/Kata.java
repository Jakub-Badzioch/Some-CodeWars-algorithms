//import org.junit.Test;
//
//import java.util.Arrays;
//import java.util.LinkedList;
//import java.util.List;
//
//import static org.junit.Assert.assertEquals;
//
//public class Kata {
//    public static boolean isAnagram(String test, String original) {
//        char[] originalChar = original.toCharArray();
//        List<Character> testList = new LinkedList<>();
//        for (char c : test.toCharArray()) {
//            testList.add(c);
//        }
//        for (char c : originalChar) {
//            for (int i = 0; i < test.length(); i++) {
//                if (c == testList.get(i)) {
//                    testList.remove(i);
//                }
//            }
//        }
//        if (testList.size() == 0) {
//            return true;
//        } else {
//            return false;
//        }
//      //  Arrays.sort(testList);
//    }
//
//    @Test
//    public void exampleTests() {
//        Kata k = new Kata();
//
//        assertEquals(true, k.isAnagram("foefet", "toffee"));
//        assertEquals(true, k.isAnagram("Buckethead", "DeathCubeK"));
//        assertEquals(true, k.isAnagram("Twoo", "Woot"));
//        assertEquals(false, k.isAnagram("apple", "pale"));
//    }
//}
