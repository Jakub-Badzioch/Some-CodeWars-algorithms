import java.util.ArrayList;
import java.util.List;

public class Cubes {
    private static boolean isCubicNumber(int num) {
        if (num == 0) return true;
        int result = 0;
        for (char aChar : String.valueOf(num).toCharArray()) {
            result += Math.pow(Integer.parseInt(String.valueOf(aChar)), 3);
        }
        return result == num;
    }

    private static String prepareOutput(List<Integer> integers) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (Integer integer : integers) {
            sb.append(integer);
            sum += integer;
            sb.append(" ");
        }
        sb.append(sum).append(" Lucky");
        return sb.toString();
    }

    private static List<Integer> findAllIntegers(String str) {

        str = replaceLongIntegers(str);
        str = str.replaceAll("[^0-9]+", " ");
        final String[] strngs = str.trim().split(" ");
        List<Integer> integers = new ArrayList<>();
        for (String strng : strngs) {
            integers.add(Integer.parseInt(strng));
        }
        return integers;
    }

    private static String replaceLongIntegers(String str) {
        str = str.replaceAll("[^0-9]+", " ");
        final String[] strngs = str.trim().split(" ");
        StringBuilder sb = new StringBuilder();
        for (String s : strngs) {
            if (s.length() >= 4) {
                sb.append(s.replaceAll("...(?!$)", "$0 "));
            } else {
                sb.append(s).append(" ");
            }
        }
        return sb.toString();
    }

    public String isSumOfCubes(String s) {
        List<Integer> cubicIntegers = new ArrayList<>();
        for (Integer integer : findAllIntegers(s)) {
            if (isCubicNumber(integer)) cubicIntegers.add(integer);
        }

        return cubicIntegers.size() == 0 ? "Unlucky" : prepareOutput(cubicIntegers);
    }
}
