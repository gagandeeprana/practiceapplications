package codility;

import java.util.Arrays;


public class OddElementsArray {

    public static void main(String[] args) {

        int[] arr = {2, 2, 3, 3, 4};
        System.out.println(new OddElementsArray().solution(arr));
    }

    int solution(int[] A) {

        Arrays.sort(A);
        int count = 1;
        if (A.length == 1) {
            return A[0];
        }
        for (int i = 0; i < A.length - 1; i++) {

            if (A[i + 1] - A[i] == 0) {
                count++;
            }
            if (A[i + 1] - A[i] != 0) {
                if (count % 2 != 0) {
                    return A[i];
                }
                count = 1;
            }
        }

        return A[A.length - 1];
    }
}
