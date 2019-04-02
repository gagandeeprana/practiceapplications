package durga;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * 1. Consumer, Supplier came in java 1.8 version
 * 2. Consumer, Supplier present in java.util.function package
 * 3. Consumer contains one abstract method - accept(T t) returns void. Consumer<T>
 * 4. Supplier wont take any input value but returns some value. Supplier<R> contains get() method to get some value (R).
 */
public class ConsumerAndSupplierInterfaceDemo {

    public static void main(String[] args) {
        
        Consumer<String> c = s -> System.out.println(s);
        c.accept("Hello Gagan");
        
        Supplier<String> s = () -> {    
                                        String arr[] = {"Gagan", "Cloud", "Work"};
                                        int x = (int)(Math.random()*3);
                                        return arr[x];
                                    };
         System.out.println(s.get());
    }
}
/**
 *  Next: DoubleColonOperatorConcept 
 */

