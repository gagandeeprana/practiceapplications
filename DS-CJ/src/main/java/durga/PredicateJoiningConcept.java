package durga;

import java.util.function.Predicate;

/**
 * P1: number gt 10 or not
 * P2: even number or not
 * 
 * p.negate() will check whether number is less than 10 or not (reverse condition of P1)
 * 
 * To satisfy both conditions p1.and(p2)
 * to satisfy atleast one condition p1.or(p2)
 * 
 * Above are the 3 methods, defaults methods inside Predicate interface.
 */
public class PredicateJoiningConcept {

    public static void main(String[] args) {
        
        int[] arr = {0,5,10,15,20,25,30};
        Predicate<Integer> p1 = i->i>10;
        Predicate<Integer> p2 = i->i%2==0;

        System.out.println("Numbers gt 10 are:");
        m1(p1, arr);

        System.out.println("Numbers lt 10 are:");
        m1(p1.negate(), arr);

        System.out.println("Numbers gt 10 and even are:");
        m1(p1.and(p2), arr);

        System.out.println("Numbers gt 10 or even are:");
        m1(p1.or(p2), arr);
    }
    
    public static void m1(Predicate<Integer> p, int[] arr) {
        
        for(int x : arr) {
            if(p.test(x)) {
                System.out.println(x);
            }
        }
    }
}
/**
 * Next: FunctionInterfaceDemo
 */
