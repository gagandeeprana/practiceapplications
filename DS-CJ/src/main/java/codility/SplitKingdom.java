package codility;

public class SplitKingdom {

    public static void main(String[] args) {
        // System.out.println(new SplitKingdom().solution(3, 4, new int[] {2, 0, 2, 0}, new int[]
        // {0, 1, 1, 3}));
        System.out.println(new SplitKingdom().solution(5, 5, new int[] {0, 4, 2, 0}, new int[] {0,
                0, 1, 4}));
    }

    public int solution(int N, int M, int[] X, int[] Y) {

        int rowWays = 0;
        int colWays = 0;
        int twoDArray[][] = new int[2][X.length];
        for (int i = 0; i < X.length; i++) {
            twoDArray[0][i] = X[i];
        }

        for (int i = 0; i < Y.length; i++) {
            twoDArray[1][i] = Y[i];
        }

        int mines = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (checkTwoArray(i, j, twoDArray)) {
                    mines++;
                }
                if (checkTwoArray(j, i, twoDArray)) {
                    mines++;
                }
            }
            if (mines == X.length / 2) {
                ways++;
            }
        }
        mines = 0;
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                if (checkTwoArray(i, j, twoDArray)) {
                    mines++;
                }
            }
            if (mines == X.length / 2) {
                ways++;
            }
        }
        return ways;
    }

    public boolean checkTwoArray(int r, int c, int[][] twoDArray) {
        for (int i = 0; i < twoDArray.length - 1; i++) {
            for (int j = 0; j < twoDArray[1].length; j++) {
                if (r == twoDArray[i][j] && c == twoDArray[i + 1][j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
}
