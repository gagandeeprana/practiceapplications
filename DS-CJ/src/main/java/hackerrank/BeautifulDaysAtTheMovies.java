package hackerrank;

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {

        int i = 20;
        int j = 23;
        int k = 6;
        System.out.println(beautifulDays(i, j, k));
    }

    static int beautifulDays(int i, int j, int k) {

        int days = 0;
        for (int count = i; count <= j; count++) {

            int reverse = 0;
            int n = count;
            int rem = 0;
            while (n > 0) {
                rem = n % 10;
                reverse = (reverse * 10) + (rem);
                n = n / 10;
            }

            if ((count - reverse) % k == 0) {
                days++;
            }
        }

        return days;
    }
}
