package algo.sorting;

import java.util.Arrays;

/**
 * insertion sorting technique.
 */
public class InsertionSort {

    public static void main(String[] args) {

        int arr[] = {13, 8, 7, 6, 91, 92, 101, 100, -10, -909};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int arr[]) {

        int lastSortedIndex = 0;
        for (int y = 0; y < arr.length - 1; y++) {

            if (arr[y] > arr[y + 1]) {

                int temp = arr[y];
                arr[y] = arr[y + 1];
                arr[y + 1] = temp;
            }

            for (int z = lastSortedIndex; z > 0; z--) {

                if (arr[z] < arr[z - 1]) {

                    int temp = arr[z];
                    arr[z] = arr[z - 1];
                    arr[z - 1] = temp;
                }
            }
            lastSortedIndex++;
        }
    }
}
