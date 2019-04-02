package durga;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public interface PredefinedFunctionalInterfaces {

    /**
     * New Java9 FunctionalInterfaces.
     * 
     * defined in java.util.function package
     * 
     * Predicate        test()
     * Function
     * Consumer
     * Supplier
     * 
     * 
     * Some other old FunctionaInterfaces:
     * 
     * Comparable       compareTo()
     * Runnable         run()
     * Callable         call()
     * ActionListener   actionPerformed()
     */
}
/**
 *   interface Predicate<T> {
 *   
 *      boolean test(T t);
 *   }
 * 
 */
interface IntegerInterf {
    
    boolean cal(Integer i);
}

class OldMethodology {
    
    public boolean test(Integer i) {
        if(i>10)
            return true;
        else
            return false;
    }
}

class LambdaMethodology {
    
    public void m1() {
        
        IntegerInterf iI = (Integer i) -> {
            if(i > 10)
                return true;
            else
                return false;
        };
        
        System.out.println("Result " + iI.cal(20));
    }
    
}

/**
 * Predicate interface can refer lambda expression as below example.
 *
 */
class PredicateMethodology {
    
    public void m1() {
        
        Predicate<Integer> p = i-> i>10;
        System.out.println("Result " + p.test(5));
        System.out.println("Result again " + p.test(100));
        
        /**
         * in case of wrong type argument(e.g String in case of Integer) passed, compiler will throw error String cannot be
         * converted to Integer.
         */
        
//        System.out.println("Result again " + p.test("Gagan"));
    }

    public static void main(String[] args) {
        
//        new PredicateMethodology().m1();
//        new StringLength().m1();
        new CollectionEmptyCheck().m1();
    }
}

class StringLength {
    
    public void m1() {
        
        Predicate<String> p = s -> s.length() > 5;
        System.out.println(p.test("Gagan"));
    }
}

class CollectionEmptyCheck {
    
    public void m1() {
        
        Predicate<Collection> p = c-> c.isEmpty();
        ArrayList al1 = new ArrayList();
        al1.add(new Object());
        System.out.println("Given Collection is Empty or not: " + p.test(al1));
    }
}
/**
 * Points related to Predicate Interface:
 * 
 * 1. It is present in java.util.function package
 * 2. It came in the java 1.8 version
 * 3. It contains only one method - test(Object obj) returns boolean
 *    and perform some conditional check and based on that conditional check
 *    it will return true or false.
 * 
 */

/**
 * Next: PredicateJoiningConcept
 */








