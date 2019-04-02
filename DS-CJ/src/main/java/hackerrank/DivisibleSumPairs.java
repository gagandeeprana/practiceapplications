package hackerrank;

public class DivisibleSumPairs {

    public static void main(String[] args) {

        int ar[] = {1, 3, 2, 6, 1, 2};
        System.out.println(divisibleSumPairs(6, 3, ar));
    }

    static int divisibleSumPairs(int n, int k, int[] ar) {

        int pairs = 0;

        for (int i = 0; i < ar.length; i++) {

            for (int j = i + 1; j < ar.length; j++) {

                if (i < j && ((ar[i] + ar[j]) % k == 0)) {

                    pairs++;
                }

            }

        }
        return pairs;
    }
}
