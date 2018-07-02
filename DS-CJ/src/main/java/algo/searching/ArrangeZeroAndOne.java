package algo.searching;

import java.util.Arrays;

//TODO
public class ArrangeZeroAndOne {

    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 1, 0, 1, 0, 0, 1, 1};
        Arrays.sort(arr);
        for (int count = 0; count < arr.length; count++) {
            System.out.print(arr[count] + " ");
        }
        System.out.println();
    }
}
