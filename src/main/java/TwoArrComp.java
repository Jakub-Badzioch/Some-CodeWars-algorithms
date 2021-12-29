import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoArrComp {
    public static int[] arrayDiff(int[] a, int[] b) {
        final List<Integer> aList = arrToList(a);
        final List<Integer> bList = arrToList(b);

        for (Integer i : bList) aList.removeIf(i::equals);

        return aList.stream().mapToInt(i -> i).toArray();
    }

    private static List<Integer> arrToList(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toList());
    }
}
