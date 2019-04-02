package codility;

import java.util.ArrayList;
import java.util.List;

public class Sample {

    public static void main(String[] args) {

        List<List<Integer>> keyTimes = new ArrayList<List<Integer>>();
        ArrayList<Integer> k = new ArrayList<Integer>();
        k.add(0);
        k.add(2);
        ArrayList<Integer> k1 = new ArrayList<Integer>();
        k1.add(1);
        k1.add(3);
        ArrayList<Integer> k2 = new ArrayList<Integer>();
        k2.add(0);
        k2.add(7);
        keyTimes.add(k);
        keyTimes.add(k1);
        keyTimes.add(k2);
        System.out.println(slowestKey(keyTimes));

    }

    public static char slowestKey(List<List<Integer>> keyTimes) {

        int base = 97;
        int maxValue = keyTimes.get(0).get(1);
        int maxIndex = 0;
        for (int i = 1; i < keyTimes.size(); i++) {
            if ((keyTimes.get(i).get(1) - keyTimes.get(i - 1).get(1)) > maxValue) {
                maxValue = (keyTimes.get(i).get(1) - keyTimes.get(i - 1).get(1));
                maxIndex = i;
            }
        }
        return ((char) (base + keyTimes.get(maxIndex).get(0)));
    }
}
