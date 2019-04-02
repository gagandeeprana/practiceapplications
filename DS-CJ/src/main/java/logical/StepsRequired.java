package logical;

public class StepsRequired {

    public static void main(String[] args) {

        System.out.println(steps(4, 1));
    }

    static int steps(int x, int y) {

        if (x == y) {
            return x * 2;
        } else if (x == 0) {
            return y * 2;
        } else if (y == 0) {
            return x * 2;
        } else {
            return (x + y + 2);
        }
    }
}
