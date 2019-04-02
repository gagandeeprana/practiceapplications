package hackerrank;

import java.util.ArrayList;
import java.util.List;

//https://www.hackerrank.com/challenges/compare-the-triplets/problem?h_r=next-challenge&h_v=zen
public class AliceAndBob {

    public static void main(String[] args) {
        
        List<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> b = new ArrayList<Integer>();
        b.add(3);
        b.add(2);
        b.add(1);
        System.out.println(compareTriplets(a, b));
    }
    
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        result.add(0);
        if(a != null && a.size() > 0) {
            for(int i=0;i<a.size();i++) {
                
                if(a.get(i) > b.get(i)) {
                    result.set(0, result.get(0)+1);
                } else if(a.get(i) < b.get(i)) {
                    
                    result.set(1, result.get(1)+1);
                }
            }
        } else {
            
            result.set(0, result.get(0)+1);
        }

        return result;
    }
}
