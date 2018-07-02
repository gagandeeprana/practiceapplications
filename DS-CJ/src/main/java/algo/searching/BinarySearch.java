package algo.searching;

import java.util.Arrays;

public class BinarySearch {

    static int findNumber = 67;
    
    static int middleIndex = 0;
    
    public static void main(String[] args) {
        
        int arr[] = {44, 67, 12, 86, 22, 34};
        Arrays.sort(arr);
        System.out.println(findIndex(arr, 0, arr.length, findNumber));
    }

    static int findIndex(int arr[], int leftIndex, int rightIndex, int findNumber) {

        while(rightIndex >= leftIndex) {
            
            middleIndex = (rightIndex+leftIndex) / 2;
            
            if(findNumber == arr[middleIndex]) {
                return middleIndex;
            }
            
            if(findNumber > arr[middleIndex]) {
                
                return findIndex(arr, middleIndex+1, rightIndex, findNumber);
            } else if(findNumber < arr[middleIndex]) {
    
                return findIndex(arr, leftIndex, middleIndex-1, findNumber);
            }
        }
        return -1;
    }
    
    static void printArray(int arr[]) {
        
        for(int count=0;count<arr.length;count++) {
            System.out.print(arr[count] + " ");
        }
        System.out.println();
    }
    
}
