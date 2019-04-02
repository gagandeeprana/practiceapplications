package hackerrank;

public class DrawingBook {

    public static void main(String[] args) {

        // System.out.println(pageCount(5, 4));
        // System.out.println(pageCount(6, 2));
        // System.out.println(pageCount(6, 5));
        System.out.println(pageCount(73201, 57075));

    }

    static int pageCount(int n, int p) {

        if (p < n / 2 || p == (n / 2)) {
            return p / 2;
        } else {
            if (p % 2 == 0 || n == p) {
                return (n - p) / 2;
            } else if (p % 2 != 0 && n != p && n % 2 == 0) {
                return ((n - p) / 2) + 1;
            } else {
                return (n - p) / 2;
            }
        }
    }
}
