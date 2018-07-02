package algo.sorting;

public class SelectionSortAlgo {

    public static void main(String[] args) {

        int[] arr = {64, -9, 9, 22, 23};

        //initialize the number with first value.
        int smallestNo = arr[0];
        for (int x = 0; x < arr.length; x++) {

            for (int y = x + 1; y < arr.length; y++) {
                
                if(arr[x] < arr[y] && smallestNo > arr[x]) {
                    smallestNo = x;
                }
            }
            
            int temp = 
        }
        
//        System.out.println("Smallest number " + smallestNo);
    }
}
