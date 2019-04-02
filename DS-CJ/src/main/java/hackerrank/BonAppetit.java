package hackerrank;

import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    public static void main(String[] args) {

        Integer[] arr = {3, 10, 2, 9};
        List<Integer> bill = Arrays.asList(arr);
        int k = 1;
        int b = 7;
        bonAppetit(bill, k, b);
    }

    static void bonAppetit(List<Integer> bill, int k, int b) {

        int bActual = 0;
        for (int i = 0; i < bill.size(); i++) {

            if (i == k) {
                continue;
            }
            bActual += bill.get(i);
        }
        bActual /= 2;
        if (bActual == b) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(b - bActual);
        }
    }
}
