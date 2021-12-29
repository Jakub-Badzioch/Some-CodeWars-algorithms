public class Square {
    public static final String generateShape(int n) {
        StringBuilder output = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            output.append("+".repeat(n));
            if(i != n){
            output.append(System.lineSeparator());
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateShape(3));
    }
}
