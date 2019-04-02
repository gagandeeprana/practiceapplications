package codility;

import java.util.Arrays;

public class MissingElement {

    public static void main(String[] args) {

//        int[] arr = {21, 22, 23};
//        int[] arr = {1, 3, 6, 4, 1, 2};
        int[] arr = {3, 1, 2};
//        int[] arr = {2};
//        int[] arr = {-1, -3};
//        int[] arr = {-1};
        System.out.println(new MissingElement().solution(arr));
    }

    int solution(int[] A) {
        boolean isSuccess = false;

        if(A.length > 0) {
            
            Arrays.sort(A);
            if(A.length == 1) {
                
                if(A[0] <= 0) {
                    return 1;
                } else {
                    if(A[0] - 1 == 1) {
                        return 1;
                    } else {
                        return ++A[0];
                    }
                }
            }
            
            for (int i = 0; i < A.length; i++) {
                
                if ((i < A.length - 1) && (A[i + 1] - A[i] != 1) && (A[i + 1] != A[i])) {
                    
                    isSuccess = true;
                    if((A[i + 1] - 1) > 0) {
                        return A[i + 1] - 1;
                    } else {
                        return 1;
                    }
                }
            }
            if(!isSuccess) {
                return ++A[A.length-1];
            }
            
        }
        
        return 1;
    }
}
