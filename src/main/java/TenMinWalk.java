public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        if (walk.length != 10) return false;

        int horizontal = 0;
        int vertical = 0;

        for (char direction : walk) {
            if (direction == 'n') {
                ++vertical;
            } else if (direction == 's') {
                --vertical;
            } else if (direction == 'w') {
                ++horizontal;
            } else {
                --horizontal;
            }
        }

        return horizontal == 0 & vertical == 0;
    }
}
