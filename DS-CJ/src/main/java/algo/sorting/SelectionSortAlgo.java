package algo.sorting;

import java.util.Arrays;

/**
 * selection sorting technique.
 */
public class SelectionSortAlgo {

    public static void main(String[] args) {

        int[] arr = {64, -9, 9, -5, 23};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void selectionSort(int arr[]) {

        //initialize the number with first value.
        for (int x = 0; x < arr.length; x++) {

            int updatedSmallestIndex = x;
            for (int y = x + 1; y < arr.length; y++) {
                
                if(arr[y] < arr[updatedSmallestIndex] ) {
                    updatedSmallestIndex = y;
                }
            }

            int temp = arr[updatedSmallestIndex];
            arr[updatedSmallestIndex] = arr[x];
            arr[x] = temp;
        }
    }
}
