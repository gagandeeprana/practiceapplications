package arrayquestions;

import java.util.Arrays;
import java.util.concurrent.Semaphore;

public class MissingNoInArray {

	/**
	 * arrays can be printed using Arrays.toString(arr);
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[] = {50,49,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,0,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,2,1};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i = 0; i < arr.length; i++) {
			if(arr[i+1] - arr[i]  != 1) {
				System.out.println("Missing Digit is: " + (i+1));
				break;
			}
		}
	}
}
