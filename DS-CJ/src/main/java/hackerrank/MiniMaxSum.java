package hackerrank;


public class MiniMaxSum {

    public static void main(String[] args) {

        int arr[] = {256741038, 623958417, 467905213, 714532089, 938071625};
        miniMaxSum(arr);
    }

    static void miniMaxSum(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        long mini = 0;
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                max = max + arr[i];
            }
            if (i != arr.length - 1) {
                mini = mini + arr[i];
            }
        }
        System.out.println(mini + " " + max);

    }
}
