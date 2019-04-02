package hackerrank;

public class ApplesAndOranges {

    public static void main(String[] args) {

        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        int[] apples = {-2, 2, 1};
        int[] oranges = {5, -6};
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }

    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {

        int appleCounter = 0;
        int orangeCounter = 0;

        int max = oranges.length;
        if (oranges.length < apples.length) {
            max = apples.length;
        }
        for (int i = 0; i < max; i++) {

            if (i < apples.length && s <= (apples[i] + a) && (apples[i] + a) <= t) {
                appleCounter++;
            }
            if (i < oranges.length && s <= (oranges[i] + b) && (oranges[i] + b) <= t) {
                orangeCounter++;
            }
        }
        System.out.println(appleCounter);
        System.out.println(orangeCounter);
    }
}
