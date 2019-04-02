package hackerrank;

import java.util.Arrays;

public class CircularArrayRotation {

    public static void main(String[] args) {

        int a[] = {3, 4, 5};
        int k = 2;
        int queries[] = {1, 2};
        System.out.println(Arrays.toString(circularArrayRotation(a, k, queries)));
    }

    static int[] circularArrayRotation(int[] a, int k, int[] queries) {

        int[] arr = new int[a.length];
        int[] result = new int[queries.length];

        for (int i = 0; i < a.length; i++) {

            arr[(i + k) % a.length] = a[i];

            // if (i + k >= a.length) {
            //
            // arr[(i + k) - a.length] = a[i];
            // } else {
            // arr[i + k] = a[i];
            // }
        }

        for (int i = 0; i < queries.length; i++) {

            result[i] = arr[queries[i]];
        }

        return result;
    }
}
