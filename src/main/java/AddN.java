import java.nio.charset.CharacterCodingException;
import java.util.function.IntUnaryOperator;

public class AddN {
    public static IntUnaryOperator add(int n) {
        return num -> num + n;
    }

    public static String binaryToText(String binary) {
        StringBuilder value = new StringBuilder();
        //skacze co 8
        for (int i = 0; i < binary.length(); i = i + 8) {

            //wycinam 8 cyfrowe określenie znaku w ASCII
            String substring = binary.substring(i, i + 8);

            // zamieniam liczbe ośmioelementową na odpowiadającą jej liczbę dwuelementową w ASCII
            int num = Integer.parseInt(substring, 2);

            // rzutuje liczbe dwuelementową na odpowiadający jej char w ASCII
            char ASCIIchar = (char) num;


            value.append(ASCIIchar);
        }
        return value.toString();
    }


    public static int[] DataReverse(int[] data) {
        int byteAmount = data.length / 8;
        int count = byteAmount - 1;
        String[] newBytesOrder = new String[byteAmount];
        StringBuilder sb = new StringBuilder();

        for (int i : data) {
            sb.append(i);
        }
        String binary = sb.toString();


        for (int i = 0; i < binary.length(); i = i + 8) {
            newBytesOrder[count] = binary.substring(i, i + 8);
            --count;
        }

        sb = new StringBuilder();
        for (String s : newBytesOrder) {
            sb.append(s);
        }


        char[] preOutput = sb.toString().toCharArray();
        int[] output = new int[preOutput.length];
        for (int i = 0; i < preOutput.length; i++) {
            output[i] = preOutput[i] - '0';
        }
        return output;
    }

    public static void main(String[] args) throws CharacterCodingException {
    }
}

/*
*   private static String arraytoString(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i);
        }
        return sb.toString();
    }


    public static int[] DataReverse(int[] data) {
        String binary = arraytoString(data);
        int byteAmount = data.length / 8;
        String[] newBytesOrder = new String[byteAmount];


        int count = byteAmount - 1;
        for (int i = 0; i < binary.length(); i = i + 8) {
            //wycinam 8 cyfrowe określenie znaku w ASCII
            String substring = binary.substring(i, i + 8);
            newBytesOrder[count] = substring;
            --count;
        }

        StringBuilder sb = new StringBuilder();
        for (String s : newBytesOrder) {
            sb.append(s);
        }

        char[] preOutput = sb.toString().toCharArray();
        int[] output = new int[preOutput.length];
        for (int i = 0; i < preOutput.length; i++) {
            output[i] = preOutput[i] - '0';
        }
        return output;
    }*/
