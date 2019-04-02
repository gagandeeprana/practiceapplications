package hackerrank;

public class FindDigits {

    public static void main(String[] args) {

        int n = 1012;
        System.out.println(findDigits(n));
    }

    static int findDigits(int n) {

        int val = n;
        int divisors = 0;
        while (val > 0) {

            int divisor = val % 10;
            if (divisor != 0 && n % divisor == 0) {
                divisors++;
            }
            val = val / 10;
        }
        return divisors;
    }
}
