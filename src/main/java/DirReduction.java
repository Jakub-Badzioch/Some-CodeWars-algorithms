import java.util.ArrayList;
import java.util.List;

public class DirReduction {

    private static String[] replaceOppositeCoordinatesWithGowno(String[] arr){
        for (int i = 0; i < arr.length-1; i++) {

            boolean a = arr[i].equals("WEST") & arr[i+1].equals("EAST");
            boolean b = arr[i].equals("EAST") & arr[i+1].equals("WEST");
            boolean c = arr[i].equals("NORTH") & arr[i+1].equals("SOUTH");
            boolean d = arr[i].equals("SOUTH") & arr[i+1].equals("NORTH");

            if (a|b|c|d){
                arr[i] = "gowno";
                arr[i+1] = "gowno";
            }
        }

        return arr;
    }

   private static String[] removeAllGownos(String[] arr){

       List<String> coordinates = new ArrayList<>();

       for (String s : arr) {
           if (!s.equals("gowno")){
               coordinates.add(s);
           }
       }

       return coordinates.toArray(new String[0]);

    }

    public static String[] dirReduc(String[] arr) {

        for (int i = 1; i <= 2 ; i++) {
            arr = removeAllGownos(replaceOppositeCoordinatesWithGowno(arr));
        }
        return arr;

    }
}