package arrayquestions;

import java.util.Arrays;

/**
 * 
 * this programs sorts string values
 *
 */
public class SortStringValues {

    public static void main(String[] args) {
        
        String[] arr = {"Collection", "Java", "Alance", "Alande", "Balram"};
        System.out.println(Arrays.toString(arr));
        arrangeStrings(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    static void arrangeStrings(String[] arr) {
        
        for(int x = 0; x < arr.length; x++) {
            
            int smallestIndex = x;
            for(int y=x+1;y<arr.length;y++) {
                
                if(arr[y].compareTo(arr[smallestIndex]) < 0) {
                    smallestIndex = y;
                }
            }
            
            String temp = arr[smallestIndex];
            arr[smallestIndex] = arr[x];
            arr[x] = temp;
        }
         
    }
}
