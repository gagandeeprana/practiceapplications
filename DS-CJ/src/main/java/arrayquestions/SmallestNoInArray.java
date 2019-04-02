package arrayquestions;

public class SmallestNoInArray {

    public static void main(String[] args) {
        
        int[] arr = {64, -9, 9, -15, 23};

        System.out.println("Smallest No.: " + smallestNumber(arr));
    }
    
    static int smallestNumber(int[] arr) {
        
        int smallestIndex = 0;
        for (int y = smallestIndex + 1; y < arr.length; y++) {
            
            if(arr[smallestIndex] > arr[y]) {
                smallestIndex = y;
            }
        }
        return arr[smallestIndex];
    }
}
