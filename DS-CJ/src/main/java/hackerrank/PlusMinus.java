package hackerrank;

public class PlusMinus {

    public static void main(String[] args) {
        int arr[]={1,1,0,-1,-1};
        plusMinus(arr);

    }

    static void plusMinus(int[] arr) {

        double positive = 0;
        double negative = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            }
        }
        System.out.println(positive / arr.length);
        System.out.println(negative / arr.length);
        System.out.println((arr.length - (positive + negative)) / arr.length);
    }
}
