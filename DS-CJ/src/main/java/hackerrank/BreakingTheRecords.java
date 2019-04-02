package hackerrank;

import java.util.Arrays;

public class BreakingTheRecords {

    public static void main(String[] args) {
        
        int[] scores = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        System.out.println(Arrays.toString(breakingRecords(scores)));
    }
    
    static int[] breakingRecords(int[] scores) {
        
        int best = 0;
        int bestCounter = 0;
        int worstCounter = 0;
        int worst = 0;
        if(scores.length > 0) {
            
            best = scores[0];
            worst = scores[0];
            for (int i = 1; i < scores.length; i++) {
                
                if(scores[i] > best) {
                    best = scores[i];
                    bestCounter++;
                }
                if(scores[i] < worst) {
                    worst = scores[i];
                    worstCounter++;
                }
            }
        }
        int[] arr = new int[2];
        arr[0] = bestCounter;
        arr[1] = worstCounter;
        return arr;
    }
}
