

public class FirstNonConsecutive {
    static Integer find(final int[] array) {
        for(int i = 1; i < array.length; ++i){
            if(array[i] - array[i - 1] != 1)
            {
                return array[i];
            }
        }
        return null;
    }


    public static void main(String[] args) {

        System.out.println(find(new int[]{1, 2, 3, 4, 6, 7, 8})); // 6
        System.out.println(find(new int[]{1, 2, 3, 4, 5, 6, 7, 8})); // null
        System.out.println(find(new int[]{4, 6, 7, 8, 9, 11})); // 6
        System.out.println(find(new int[]{4, 5, 6, 7, 8, 9, 11})); // 11
        System.out.println(find(new int[]{31, 32})); // null
        System.out.println(find(new int[]{-3, -2, 0, 1})); // 0
        System.out.println(find(new int[]{-5, -4, -3, -1})); // -1
    }
}
