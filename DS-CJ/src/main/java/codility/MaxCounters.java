package codility;

import java.util.Arrays;


public class MaxCounters {

    public static void main(String[] args) {
        int A[] = new int[7];
        A[0] = 3;
        A[1] = 4;
        A[2] = 4;
        A[3] = 6;
        A[4] = 1;
        A[5] = 4;
        A[6] = 4;
        System.out.println(Arrays.toString(new MaxCounters().solution(5, A)));
    }
    
    public int[] solution(int N, int[] A) {

        
        int[] result = new int[N];
        int biggest = result[0];
        if(A.length > 0) {
            for (int i = 0; i < A.length; i++) {
                if(A[i] > N) {
                    Arrays.fill(result, biggest);
                } else {
                    result[A[i]-1]++;
                    if(result[A[i]-1] > biggest) {
                        biggest = result[A[i]-1];
                    }
                }
            }
        }
        return result;
    }
}
