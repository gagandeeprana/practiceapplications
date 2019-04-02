package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCake {

    public static void main(String[] args) {

        int ar[] = {3, 2, 1, 3, 7,9,9};
        System.out.println(birthdayCakeCandles(ar));
    }

    static int birthdayCakeCandles(int[] ar) {

        int max = 0;
        int maxIndex = 0;
        for (int i = 0; i < ar.length; i++) {

            if(ar[i] > max) {
                max = ar[i];
                maxIndex = i;
            }
        }
        int counter = 1;
        for (int i = ar.length - 1; i > 0; i--) {

            if (max - ar[i] == 0 && i != maxIndex) {
                counter++;
            }
        }
        return counter;


    }
}
