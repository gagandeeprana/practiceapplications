package durga;

import java.util.function.Function;

/**
 *  1. it came in java 1.8 version
 *  2. present in java.util.function package
 *  3. contains one method - apply(T,R) can return any type of object.
 */
public class FunctionInterfaceDemo {

    public static void main(String[] args) {
        
        Function<String, Integer> f = s -> s.length();
        System.out.println(f.apply("Gagan"));
    }
}
/**
 * 
 * Predicate is a special case of Function where return type is always boolean type.
 * 
 *  Differences between Predicate and Function interface
 *  ---------------------------------------------------------------------------------------------------------------------
 *                          Predicate                           |                          Function
 *  ---------------------------------------------------------------------------------------------------------------------
 *     1. To implement conditional checks, we should go         |   To perform certain operation and to return some result
 *        for Predicate interface.                              |   result, we should go for Function interface.
 *                                                              |
 *     2. Predicate can take one type parameter which           |   Function can take two types parameters. First one
 *        represents input argument type                        |   represents input argument type and second one 
 *        Predicate<T>                                          |   represents result
 *                                                              |   Function<T,R>
 *                                                              |
 *     3. Predicate interface defines one abstract method       |   Function interface defines one abstract method called 
 *        called test(T t).                                     |   apply(T t).
 *                                                              |
 *     4. public boolean test(T t).                             |   public R apply(T t)
 *                                                              |
 *     5. Predicate can return only boolean value.              |   Function can return any type of value.
 * 
 */

/**
 * Next: ConsumerAndSupplierInterfaceDemo
 */






