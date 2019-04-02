package durga;

/**
 * to invoke/ call lambda expression, we use functional interface
 *
 * If the interface contains only one abtract method, then it is called functional interface. E.g:
 * Runnable, Callable, ActionListener, Comparable, Comparator
 * 
 * any number of default and static methods are allowed in functional interface.
 * 
 * Functional Interface acts as a type for lambda expression.
 * 
 * compiler raises error if interface contains more than one abtract method, in case we use @FunctionalInterface
 * annotation.
 */
@FunctionalInterface
public interface FunctionalInterfaceDemo {

    void m1();

    default void m2() {

    }

    static void m3() {

    }
}


@FunctionalInterface
interface FunctionalInterfaceExample {

    void add(int a, int b);

}


@FunctionalInterface
interface SquareInterface {

    int square(int a);
}


/**
 * If an interface extends functional interface and child interface does not contain any abstract
 * method, then child interface is always Functional interface.
 * 
 * In the child interface, we can define exactly same parent interface abtract method.
 * 
 * In the child interface we can't define any new abstract methods otherwise we will get CTE.
 * 
 * In the child interface, we can define new abstract methods if we don't declare child interface
 * with @FunctionalInterface annotation.
 */
@FunctionalInterface
interface ChildInterface extends FunctionalInterfaceDemo {
//    void m7();
//    void m8();
//    void m9();
//    void m10();
}


class LambdaImplementation {

    public static void main(String args[]) {

        FunctionalInterfaceDemo i = () -> System.out.println("Great");
        i.m1();
        /**
         * Compiler can guess automatically data type based on the context, it is called Type
         * Inference.
         */
        FunctionalInterfaceExample ei = (a, b) -> System.out.println("The Sum is " + (a + b));
        ei.add(3, 4);
        ei.add(100, 200);
    }
}


class SquareImplementation {

    public static void main(String[] args) {
        SquareInterface si = y -> y * y;
        System.out.println(si.square(4));
        System.out.println(si.square(5));

    }
}


/**
 * Lambda expression implemention with inbuilt functional interfaces like Runnable.
 */
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("My Runnable: " + i);
        }
    }
}


class InbuiltFunctionalInterfaceImplementation {

    public static void main(String[] args) {

        // Runnable r = new MyRunnable();
        // Thread t = new Thread(r);
        // t.start();
        /**
         * The above code is an old methodology
         */
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("My Runnable: " + i);
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}


/**
 * Ques: Why functional interface should contain only one abtract method?
 * 
 * Answer: If we add one more abstract method, then compiler is going to get confused in
 * implementation and type of arguments in methods in the interface.
 * 
 * Lambda expression should map to some method of Functional interface
 * 
 * Answer: Because Functional interface concept came for implementing/ invoking Lambda Expression.
 * So, compulsory Lambda expression implementation should map with only one method of Functional
 * interface.
 *
 * Ques: Advantage of @FunctionalInterface annotation ?
 * 
 * Answer: Multiple lambda expressions implementations can map to SAM of functional interface. So, to
 * specify explicitly that no one adds more abstract methods to that functional interface, we use this annotation.
 *
 */
interface A {

    void m1(int a);

    void m2(int b);
}


class AImpl {

    public static void main(String[] args) {

//         A a1 = a -> System.out.println(a*a);

    }
}
/**
 * Next: AnnonymousClassVsLambdaExpression
 */

