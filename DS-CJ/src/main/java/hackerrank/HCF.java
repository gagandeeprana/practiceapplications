package hackerrank;

public class HCF {

    public static void main(String[] args) {
        System.out.println(hcf(98, 56));
        
    }
    
    
    static int hcf(int a, int b) {
        
        if(b == 0) {
            return a;
        }
        
        return hcf(b, a%b);
    }
}
