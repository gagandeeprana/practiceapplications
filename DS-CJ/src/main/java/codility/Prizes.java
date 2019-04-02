package codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prizes {

    public static void main(String[] args) {
        
        List<Integer> marks = new ArrayList<Integer>();
        marks.add(100);
        marks.add(25);
        marks.add(50);
        marks.add(100);
 
        System.out.println(numOfPrizes(2, marks));
    }
    
    public static int numOfPrizes(int k, List<Integer> marks) {
        
        
        Collections.sort(marks, Collections.reverseOrder());
        List<Integer> ranks = new ArrayList<Integer>();
        int rank = 1;
        ranks.add(rank);
        for (int i = 1; i < marks.size()-1; i++) {
            if(marks.get(i) != marks.get(i-1)) {
                ++rank;
                ranks.add(rank);
            } else {
                ranks.add(rank);
            }
        }
        ++rank;
        ranks.add(rank);
        int prizes = 0;
        for(int i=0;i<ranks.size();i++) {
            if(ranks.get(i) <= k) {
                prizes++;
            }
        }
        return prizes;
    }
}


