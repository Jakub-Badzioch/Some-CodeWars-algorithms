import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class DescendingOrder {
    public static int sortDesc(int num) {
        List<Integer> inputList = new LinkedList<>();
        while (num > 0) {
            inputList.add(num % 10);
            num = num / 10;
        }

        List<Integer> result = new ArrayList<>();
        /** Nie wiem jak to zrobić żeby za każdym razem wybierana została największa liczba; nie licząc liczb które zostały juz wybrane  **/
        int initialSize = inputList.size();
        for (int i = 0; i < initialSize; i++) {

            int maximum = Integer.MIN_VALUE;
            for (int j = 0; j < inputList.size(); j++) {
                if (inputList.get(j) > maximum) {
                    maximum = inputList.get(j);
                }
            }
            result.add(maximum);
            inputList.remove((Integer) maximum);

        }
        /** Koniec problemu **/
        StringBuilder sb = new StringBuilder();
        for (Integer el : result) {
            sb.append(el);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(546389678));
    }
}
