package hackerrank;

public class DiagonalDifference {

    public static void main(String[] args) {
        int arr[][] = { {11, 2, 4}, {4, 5, 6}, {10, 8, -12}};
        System.out.println(diagonalDifference(arr));
    }

    static int diagonalDifference(int[][] arr) {

        int x = 0;
        int y = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    x = x + arr[i][j];
                }
                if ((i + j) == (arr.length - 1)) {
                    y = y + arr[i][j];
                }
            }
        }
        return Math.abs(x - y);
    }
}
