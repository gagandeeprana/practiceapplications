package logical;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Socks {

    public static void main(String[] args) {

        int n = 9;
        int[] socks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(pairOfSocks(n, socks));
    }

    static int pairOfSocks(int n, int[] ar) {

        Map<Integer, Integer> socksCounterMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {

            int counter = 0;
            if (!socksCounterMap.containsKey(ar[i])) {

                socksCounterMap.put(ar[i], ++counter);
            } else {

                counter = socksCounterMap.get(ar[i]);
                socksCounterMap.put(ar[i], ++counter);
            }

        }

        Iterator<Integer> itr = socksCounterMap.keySet().iterator();
        int pairs = 0;
        while (itr.hasNext()) {

            Integer key = itr.next();
            pairs += socksCounterMap.get(key) / 2;
        }

        return pairs;
    }
}
