package hackerrank;

public class CreateMagicSquare {

    public static void main(String[] args) {
        
    }
    
    static void generateSquare(int n) {
        
        int[][] magicSquare = new int[n][n];
        
        int i = n/2;
        int j = n-1;
        
        int num = 1;
        while(num < n*n) {
            
            if(i == -1 && j == n) {
                
                j=n-2;
                i=0;
            }
            
            if(magicSquare[i][j] != 0) {
                j -= 2;
                i++;
                continue;
            }
            
            i--;
            j++;
        }
    }
}
