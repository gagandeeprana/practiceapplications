package hackerrank;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {

    static int migratoryBirds(List<Integer> arr) {

        int birds = 0;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.size(); i++) {

            int counter = 0;
            if (map.containsKey(arr.get(i))) {

                Integer val = map.get(arr.get(i));
                map.put(arr.get(i), ++val);
            } else {
                counter++;
                map.put(arr.get(i), counter);
            }

        }

        long maxValue = map.values().stream().max(Comparator.naturalOrder()).get();

        Map.Entry<Integer, Integer> m  =
                map.entrySet().stream().filter(e -> e.getValue() == maxValue).findFirst().get();
        System.out.println(m.getKey() + " " + m.getValue());
        return birds;
    }

    public static void main(String[] args) {

         Integer s[] = {1, 4, 4, 4, 5, 3};
//        Integer s[] = {1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4};
        List<Integer> arr = Arrays.asList(s);
        System.out.println(migratoryBirds(arr));
    }
}
