package algo.searching;

public class LinearSearch {

    static int findNumber = 86;

    public static void main(String[] args) {

        int arr[] = {44, 67, 12, 86, 22, 34};

        System.out.println(findIndex(arr));
    }

    public static int findIndex(int arr[]) {

        for (int count = 0; count < arr.length; count++) {

            if (arr[count] == findNumber) {
                return count;
            }
        }

        return -1;
    }
}
