package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class EarliestTime {

    public static void main(String[] args) {

        // int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int A[] = {1, 1, 1, 1};
        // int A[] = {1, 3, 1, 4, 2, 3, 5, 4};
        int X = 2;
        System.out.println(new EarliestTime().solution(X, A));
    }

    public int solution(int X, int[] A) {

        if (A.length != 0 && X <= A.length) {
            Set<Integer> chk = new HashSet<Integer>();
            boolean isPresent = false;
            for (int i = 0; i < A.length - 1; i++) {

                isPresent = false;
                if (A[i] != X) {
                    chk.add(A[i]);
                }
                if (A[i] == X) {
                    isPresent = true;
                    List<Integer> l = new ArrayList<Integer>(chk);
                    Collections.sort(l);
                    if (X - (l.get(l.size() - 1)) == 1) {

                        for (int j = l.size() - 1; j >= 0; j--) {
                            if (l.get(j) - l.get(j - 1) != 1) {

                                break;
                            }
                            return i;
                        }
                    }
                    continue;
                }
            }
            if (isPresent || A[0] == X) {
                return 0;
            }
            if (!isPresent) {
                return -1;
            }
        }
        return -1;
    }
}
