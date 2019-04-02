package logical;

public class SwapTwoNumber {

    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        System.out.println("==========================");
        System.out.println("Using Third Variable");
        System.out.println("==========================");
        System.out.println("Before swapping: a is " + a + " b is " + b);
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("After swapping: a is " + a + " b is " + b);
        System.out.println("==========================");
        System.out.println("Without using Third Variable");
        System.out.println("==========================");
        int d = 40;
        int e = 50;
        System.out.println("Before swapping: d is " + d + " e is " + e);
        d = d+e;
        e = d-e;
        d = d-e;
        System.out.println("After swapping: d is " + d + " e is " + e);
        
    }
}
