package codility;

import java.util.Arrays;

public class CyclicRotation {

    public static void main(String[] args) {

        int[] A = {};
        System.out.println(Arrays.toString(new CyclicRotation().solution(A, 3)));
    }

    int[] solution(int[] A, int K) {

        int finalArray[] = new int[A.length];
        if (A.length == 1 || A.length == 0) {
            return A;
        }
        if (K > A.length)
            K = K % A.length;
        for (int j = 0; j < A.length; j++) {
            int newIndex = 0;
            if ((j + K) >= A.length) {
                newIndex = ((j + K) - A.length);
            } else {
                newIndex = j + K;
            }
            finalArray[newIndex] = A[j];
        }

        return finalArray;
    }
}
