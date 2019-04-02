package codility;

import java.util.Arrays;

public class PermCheck {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2};
        System.out.println(new PermCheck().solution(arr));
    }

    int solution(int[] A) {
        Arrays.sort(A);

        int sum = A.length * (A.length + 1) / 2;
        for (int i = 0; i < A.length; i++) {

            if (A[i] != i + 1) {
                return 0;
            }

            sum = sum - A[i];

        }
        if (sum == 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
