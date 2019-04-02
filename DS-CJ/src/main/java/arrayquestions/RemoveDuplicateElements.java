package arrayquestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RemoveDuplicateElements {

    public static void main(String[] args) {

        int arr[] = {2, 3, 4, 5, 6, 7, 2, 3};
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            
            map.put(arr[i], arr[i]);
            
        }
        
        System.out.print("[");
        for(Entry entry : map.entrySet()) {
            
            System.out.print(entry.getKey() + ",");
        }
        System.out.println("]");
    }
}
