import java.util.*;
import java.util.stream.Collectors;


public class UniqueLettersNE {

    public static String longest(String s1, String s2) {
        // 1.polacz s1 i s2
        final String input = s1 + s2;

        // 2. usun duplikaty
        Set<Character> charSet = new HashSet<>();

        for(char c : input.toCharArray()) {
            charSet.add(c);
        }

        // 3. uloz alfabetycznie znaki
        List<Character> list = new ArrayList<>(charSet);

        //sortuje
        Collections.sort(list);

        StringBuilder stringBuilder = new StringBuilder();

        for (Character character : list) {
            stringBuilder.append(character);
        }

        return stringBuilder.toString();
    }

    public static String longest2(String s1, String s2) {
        final String input = s1 + s2;

        // input.split("")  z jednego długiego string robie wiele stringów, każdy z pojedynczym znakiem
        return Arrays.stream(input.split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(longest2("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
    }

}
