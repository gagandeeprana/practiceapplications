package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PickingNumbers {

    public static void main(String[] args) {

        List<Integer> a = new ArrayList<Integer>();
        // a.add(1);
        // a.add(1);
        // a.add(2);
        // a.add(2);
        // a.add(4);
        // a.add(4);
        // a.add(5);
        // a.add(5);
        // a.add(5);
        // -------------------
        a.add(4);
        a.add(4);
        a.add(4);
        a.add(4);
        a.add(4);
        a.add(4);
        // -----------------
        // a.add(4);
        // a.add(6);
        // a.add(5);
        // a.add(3);
        // a.add(3);
        // a.add(1);
        Integer arr[] =
                {4, 97, 5, 97, 97, 4, 97, 4, 97, 97, 97, 97, 4, 4, 5, 5, 97, 5, 97, 99, 4, 97, 5,
                        97, 97, 97, 5, 5, 97, 4, 5, 97, 97, 5, 97, 4, 97, 5, 4, 4, 97, 5, 5, 5, 4,
                        97, 97, 4, 97, 5, 4, 4, 97, 97, 97, 5, 5, 97, 4, 97, 97, 5, 4, 97, 97, 4,
                        97, 97, 97, 5, 4, 4, 97, 4, 4, 97, 5, 97, 97, 97, 97, 4, 97, 5, 97, 5, 4,
                        97, 4, 5, 97, 97, 5, 97, 5, 97, 5, 97, 97, 97};
        a = Arrays.asList(arr);
        System.out.println(pickingNumbers(a));
    }

    public static int pickingNumbers(List<Integer> a) {

        int maxLength = 0;

        // System.out.println(a.stream().collect(Collectors.groupingBy(Integer::intValue)).values()
        // .stream().max(Comparator.comparing(List::size)).get());

        // List<Map.Entry<Integer, Long>> list =
        // a.stream()
        // .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        // .entrySet().stream().sorted(Map.Entry.comparingByKey())
        // .collect(Collectors.toList());
        //
        // if (list.size() > 1) {
        //
        // for (int i = 0; i < list.size() - 1; i++) {
        //
        // Map.Entry<Integer, Long> map = list.get(i);
        //
        // if (Math.abs(map.getKey() - list.get(i + 1).getKey()) <= 1) {
        //
        // if (map.getValue().intValue() + list.get(i + 1).getValue().intValue() > maxLength) {
        // maxLength =
        // map.getValue().intValue() + list.get(i + 1).getValue().intValue();
        // }
        //
        // }
        //
        // if (map.getValue() > maxLength) {
        //
        // maxLength = map.getValue().intValue();
        // }
        // }
        // } else {
        // maxLength = list.get(0).getValue().intValue();
        // }

        Map<Integer, List<Integer>> myMap =
                a.stream().collect(Collectors.groupingBy(Integer::intValue));
        List<Integer> tempList = new ArrayList<>();
        Integer tempInt = 0;
        for (Integer i : myMap.keySet().stream().sorted().collect(Collectors.toList())) {

            if (i - tempInt <= 1) {

                tempList.addAll(myMap.get(i));
            } else {
                System.out.println("BB" + tempList);
                tempList = myMap.get(i);

            }
            tempInt = i;


        }
        System.out.println("AA " + tempList);

        return maxLength;

    }
}
