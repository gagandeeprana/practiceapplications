package algo.sorting;

import java.util.Arrays;

/**
 * bubble sorting technique
 */
public class BubbleSortAlgo {

    public static void main(String[] args) {

        int arr[] = {5, 1, 4, 2, 8};
        System.out.println(Arrays.toString(arr));
        // sort(arr);
        recursiveSort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr) {

        int x = 0;
        int l = arr.length;
        while (x < l) {

            for (int y = 0; y < l - 1; y++) {

                if (arr[y] > arr[y + 1]) {

                    int temp = arr[y + 1];
                    arr[y + 1] = arr[y];
                    arr[y] = temp;
                }
            }
            x++;
        }
    }

    public static void recursiveSort(int[] arr, int l) {

        if (l == 1) {
            return;
        }

        for (int y = 0; y < l - 1; y++) {

            if (arr[y] > arr[y + 1]) {

                int temp = arr[y + 1];
                arr[y + 1] = arr[y];
                arr[y] = temp;
            }
        }
        recursiveSort(arr, l-1);
    }

}
