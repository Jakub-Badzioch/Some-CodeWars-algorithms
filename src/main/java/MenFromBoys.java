import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MenFromBoys {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
        List<Integer> newList = new ArrayList<>();

        for (Integer element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }

        return (ArrayList<Integer>) newList;
    }

    public static int[] menFromBoys(final int[] values) {
        List<Integer> valuesList = new ArrayList<>();
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        List<Integer> preOutput = new ArrayList<>();

        for (int value : values) {
            valuesList.add(value);
        }
        for (Integer value : removeDuplicates((ArrayList<Integer>) valuesList)) {
            if (value % 2 == 0) {
                evens.add(value);
            } else {
                odds.add(value);
            }
        }

        Collections.sort(evens);
        odds.sort(Collections.reverseOrder());
        preOutput.addAll(evens);
        preOutput.addAll(odds);

        int[] output = new int[preOutput.size()];
        for (int i = 0; i < preOutput.size(); i++) {
            output[i] = preOutput.get(i);
        }

        return output;
    }

    public static void main(String[] args) {
        MenFromBoys.menFromBoys(new int[]{-94, -99, -100, -99, -96, -99});
    }
}
