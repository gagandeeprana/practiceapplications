package hackerrank;

public class MagicSquare {

    public static void main(String[] args) {

        // int s[][] = { {5, 3, 4}, {1, 5, 8}, {6, 4, 2}};
        // int s[][] = { {4, 9, 2}, {3, 5, 7}, {8, 1, 5}};
        // int s[][] = { {4, 5, 8}, {2, 4, 1}, {1, 9, 7}};
        int s[][] = { {2, 9, 8}, {4, 2, 7}, {5, 6, 7}};
        System.out.println(formingMagicSquare(s));
    }

    static int formingMagicSquare(int[][] s) {

        /*int max = 0;
        int leftD = 0;
        int horizontalArrayValues[] = new int[3];
        for (int i = 0; i < s.length; i++) {

            int rowMax = 0;
            for (int j = 0; j < s[i].length; j++) {

                rowMax = s[i][j] + rowMax;
                if (i == j) {
                    leftD = leftD + s[i][j];
                }
            }
            horizontalArrayValues[i] = rowMax;

            if (rowMax > max) {
                max = rowMax;
            }
        }
        if (leftD > max) {
            max = leftD;
        }

        int rightD = 0;
        for (int i = 0; i < s.length; i++) {

            int rowMax = 0;
            for (int j = 0; j < s[i].length; j++) {
                rowMax = s[j][i] + rowMax;
                if ((i + j) == s.length - 1) {
                    rightD = s[j][i] + rightD;
                }
            }

            if (rowMax > max) {
                max = rowMax;
            }
        }

        if (rightD > max) {
            max = rightD;
        }

        int minimumCost = 0;
        for (int i = 0; i < horizontalArrayValues.length; i++) {
            minimumCost = (max - horizontalArrayValues[i]) + minimumCost;
        }

        return minimumCost;*/
        
        int minimumCost = 0;
        int rowOrColumnSum = 15;
        for(int i=0;i<s.length;i++) {
         
            int rowSum = 0;
            for(int j=0;j<s[i].length;j++) {
                
                rowSum = rowSum + s[i][j];
            }
            
            minimumCost = minimumCost + Math.abs(rowOrColumnSum-rowSum);
        }
        
        return minimumCost;
    }
}
