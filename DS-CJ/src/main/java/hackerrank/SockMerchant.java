package hackerrank;


public class SockMerchant {

    public static void main(String[] args) {

        int ar[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(sockMerchant(9, ar));
    }

    static int sockMerchant(int n, int[] ar) {

        int max = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        int pairs = 0;
        for (int j = 1; j <= max; j++) {

            int counter = 0;
            for (int i = 0; i < ar.length; i++) {

                if (ar[i] == j) {
                    counter++;
                }
            }
            counter /= 2;
            pairs += counter;
        }
        return pairs;
    }
}
