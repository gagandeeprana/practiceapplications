package hackerrank;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

    public static void main(String[] args) {

        // Integer arr[] = {1, 2, 1, 3, 2};
        // Integer arr[] = {1, 1, 1, 1, 1, 1};
//        Integer arr[] = {2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1};
         Integer arr[] = {4};
        // int d = 3;
         int d = 4;
//        int d = 18;
        // int m = 2;
         int m = 1;
//        int m = 7;
        List<Integer> s = Arrays.asList(arr);
        System.out.println(birthday(s, d, m));
    }

    static int birthday(List<Integer> s, int d, int m) {

        int i = 0;

        int counter = 0;
        while (i < s.size() && (i + m) <= s.size()) {

            int sum = 0;

            for (int j = i; j < (i + m); j++) {
                sum = sum + s.get(j);
            }
            if (sum == d) {
                counter++;
            }
            i++;

        }
        return counter;
    }
}
