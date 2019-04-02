package durga;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *  Streams in java.util are related to Collection (group of objects).
 *  Streams in java.io are related to File
 */
public class StreamsConcept {

    public static void main(String[] args) {

        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(5);
        l.add(10);
        l.add(15);
        l.add(20);
        l.add(25);
        
        System.out.println("List: " + l);
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        for(Integer i : l) {
            if(i%2 == 0) {
                l1.add(i);
            }
        }
        System.out.println("List having even numbers using old concept: " + l1);
        
        System.out.println("List having even numbers using new concept(Streams):" + l.stream().filter(i->i%2 == 0).collect(Collectors.toList()));
    
        l1 = new ArrayList<Integer>();
        for(Integer i : l) {
            l1.add(i*2);
        }

        System.out.println("List having doubled value numbers of original list using old concept: " + l1);

        System.out.println("List having doubled value numbers of original list using new concept (Streams): " + 
        l.stream().map(i->i*2).collect(Collectors.toList()));
    }
}
/**
 * stream() method is present inside Collection interface as default method.
 * Stream is an interface present inside java.util.stream package
 * 
 * java.util.stream package introduced in java1.8 version
 * 
 * 
 * Stream s = c.stream();
 * Once we get this stream object, we can process collection objects
 * 
 * 1. Configuration
 * 2. Processing this configuration
 * 
 * Configuration can be done in 2 ways:
 * a) filter mechanism
 * b) map mechanism
 * 
 * 
 * Filtering
 * ----------
 * 1. If we want to filter elements from the collection based on some boolean condition, then
 * we should go for filtering.
 * 2. We can configure filter by using filter() method of Stream interface.
 * 
 * public Stream filter(Predicate<T> t) 
 * It can be boolean valued function or lambda expression
 * 
 * E.g: Stream s = c.stream().filter(i->i%2==0);
 * 
 * 
 * Mapping
 * ---------
 * 1. If we want to create a separate new object for every object present in the collection based
 * on some function then we should go for mapping mechanism.
 * 2. We can implement mapping by using map() method of Stream interface.
 * 
 * public Stream map(Function<T,R> f)
 * 
 * E.g: Stream s = c.stream().map(i->i*2)
 * 
 */


class ProcessingStreamSample {
    
    public static void main(String[] args) {
   
        /**
         * Processing by collect() method
         * This method collects the elements from the Stream and adding to the specifying Collection.
         */
        ArrayList<String> l = new ArrayList<String>();
        l.add("ninetyfour");
        l.add("sixtyone");
        l.add("nine");
        System.out.println("List: " + l);
        
//        List<String> l1 = l.stream().filter(i->i.length() >= 9).collect(Collectors.toList());
//        System.out.println("List having strings length gt 9: " + l1);
        
        List<String> l1 = l.stream().filter(new Predicate<String>() {
           
            @Override
            public boolean test(String t) {
                if(t.length() >= 9) {
                    return true;
                }
                return false;
            }
        }).collect(Collectors.toList());
        System.out.println("List having strings length gt 9: " + l1);
        
//        l1 = l.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
//        System.out.println("List having strings uppercase letters: " + l1);
        
        l1 = l.stream().map(new Function<String, String>() {
            
            @Override
            public String apply(String t) {
                return t.toUpperCase();
            }
        }).collect(Collectors.toList());
        System.out.println("List having strings uppercase letters: " + l1);

        
        /**
         * Processing by count() method.
         * This method returns the number of elements present inside the stream.
         * 
         * public long count() in Stream interface.
         */
        
        long numberOfElements = l.stream().filter(s-> s.length() >= 9).count();
        System.out.println("Number of elements having length gt 9: " + numberOfElements);
        
        /**
         * Processing by sorted() method
         * 
         * 1. We can use this method to sort elements inside Stream.
         * 2. We can sort either based on default natural sorting order 
         *    or based on our own customized sorting order by Comparator object.
         *    
         *    sorted() => For default natural sorting order
         *    sorted(Comparator c) => For customized sorting order
         */
        
        l1 = l.stream().sorted().collect(Collectors.toList());
        System.out.println("Default Sorted Elements: " + l1);
        
//        l1 = l.stream().sorted(new Comparator<String>() {
//            
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            };
//        }).collect(Collectors.toList());
        
        l1 = l.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
        System.out.println("Customized Sorted Elements: " + l1);
        
        /**
         * Till now, we have discussed following methods collect(), count(), sorted()
         */
        /**
         * Processing by min() and max() methods.
         * 
         * min(Comparator c)
         * It returns minimum value according to specified Comparator
         * 
         * max(Comparator c)
         * It returns maximum value according to specified Comparator
         */
        
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(110);l2.add(10);l2.add(5);l2.add(20);l2.add(15);
        System.out.println("Integer List l2: " + l2);
        
        Integer minValue = l2.stream().min((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("Minimum Value among list l2: " + minValue);

        Integer maxValue = l2.stream().max((i1,i2)-> i1.compareTo(i2)).get();
        System.out.println("Maximum Value among list l2: " + maxValue);
        
        /**
         * Processing by forEach() method
         * 
         * 1. It won't return anything
         * 2. It can take/accept lambda expression as argument and apply that lambda expression
         *    for each element present in the Stream.
         */
        
        System.out.println("Displaying elements inside the stream using forEach() method:");
//        l2.stream().forEach(elem-> {
//            
//            System.out.println(elem);
//        });
        
        /**
         * above code can be replaced as below with the help of Method Referencing.
         */
        l2.stream().forEach(System.out :: println);
        
        /**
         * Processing by toArray() method
         * 1. We can use toArray() method to copy elements present in the Stream
         *    into specified array.
         */
        Integer[] arr = l2.stream().toArray(Integer[] :: new);
        System.out.println("Displaying elements present in the newly created array: arr[]: ");
        System.out.println("Length of array: " + arr.length);
        for (Integer val : arr) {
            System.out.println(val);
        }
        
        /**
         * Stream.of() method
         * 1. It is a factory method
         * 2. We can apply Streams for group of values and arrays as well.
         */
        
        System.out.println("Displaying group of values after applying streams");
        Stream<Integer> s = Stream.of(9,99,999,9999,99999);
        s.forEach(System.out::println);
        
        System.out.println("Displaying array values after applying streams");
        Double[] d = {10.1,20.2,30.3,40.4,50.5};
        Stream<Double> s1 = Stream.of(d);
//        s1.forEach(System.out::println);
        s1.forEach(val->{
            System.out.println(val);
        });
        
    }
}
/**
 * Next: DateAndTimeConcept
 */





















