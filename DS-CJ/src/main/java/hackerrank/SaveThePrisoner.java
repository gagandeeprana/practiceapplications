package hackerrank;

public class SaveThePrisoner {

    public static void main(String[] args) {

        // int n = 3;
        // int m = 7;
        // int s = 3;
        int n = 7;
        int m = 19;
        int s = 2;
        System.out.println(saveThePrisoner(n, m, s));
    }

    static int saveThePrisoner(int n, int m, int s) {

        // for (int i = 2; i <= m; i++) {
        //
        // s++;
        // if (s == n) {
        // s = 1;
        // }
        //
        // }
        // int counter = 1;
        // while (s > 0) {
        //
        // if (s == n) {
        // s = 1;
        // counter++;
        // }
        // s++;
        // counter++;
        //
        // if (counter == m) {
        // return s;
        // }
        // }

        int a = s + m - 1;
        if (a > n) {
            if (a % n == 0) {
                return n;
            }
            return a % n;
        }

        return a;
    }
}
