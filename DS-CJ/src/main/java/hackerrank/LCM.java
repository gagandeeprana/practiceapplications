package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LCM {

    public static void main(String[] args) {

        int num[] = {4, 2, 7, 5};
        Arrays.sort(num);
        // 2, 4, 5, 7
        Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
        for (int i = 0; i < num.length; i++) {

            List<Integer> list = new ArrayList<Integer>();
            for (int j = 1; j < 10; j++) {
                list.add(num[i] * j);
            }
            map.put(num[i], list);
        }

        List<Integer> list = map.get(num[0]);
        for (int j = 0; j < list.size(); j++) {
            
            for (int i = 1; i < num.length; i++) {
                
                List<Integer> listFactors = map.get(num[i]);
                if(listFactors.contains(list.get(j))) {
                    i++;
                    
                }
            }
        }
    }
}
