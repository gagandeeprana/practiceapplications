package durga;

/**
 * There may be a chance of replacing Anonymous inner class with Lambda expression.
 *
 * Anonymouse inner class is a nameless inner class.
 * 
 */
public class AnnonymousClassVsLambdaExpression {

    public static void main(String[] args) {

        /**
         * 1. class that implements Runnable interface 2. providing implementation for run() method
         * 3. creating an object (runnable object)
         * 
         */
        Runnable r = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Class Thread: " + i);
                }
            }
        };
        // till here it is anonymous inner class code.
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}


/**
 * With Lambda expression
 * 
 */
class WithLambdaExpression {
    
    public static void main(String[] args) {
        
        Runnable r = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Child Thread: " + i);
            }
        };
        Thread t = new Thread(r);
        t.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread: " + i);
        }

    }
}
/**
 * Not all anonymous inner classes can be replaced with Lambda expression concept because both are not same concepts.
 * 
 * Anonymous inner class is more powerfful than lambda expression.
 */

/**
 * Anonymous inner class extends concrete class as well as abstract class also.
 * 
 * Anonymous inner class can also implement interface having multiple methods.
 *
 */

/**
 * If interface contain only one abstract method, then only we can use lambda expression.
 * 
 */

/**
*                                      Anonymous inner class Vs Lambda expression
 *                                     ******************************************
 *  1. can extend concrete, abstract class                      |  cannot extend concrete, abstract class
 *                                                              |  
 *  2. can implement interface having multiple methods          |  can implement interface having only one abstract method
 *                                                              |
 *  3. this keyword always refers current inner class object    |  this keyword always refers current outer class object
 *                                                              |
 *  4. we can declare instance variables inside IC.             |  we cannot declare instance variables inside Lambda exp, whatever variables are declared those are only local
 *                                                              |  variables.
 *  5. it is a class without name.                              |  it is a function without name.
 *                                                              |        
 *  6. AIC can be instantiated.                                 |  Lambda exp cannot be instantiated.
 *                                                              |    
 *  7. AIC is best choice if we want to handle multiple         |  It is best if we want to handle interface with SAM (functional interface)
 *     methods.                                                 |
 *                                                              |
 *  8. At the time of compilation, separate .class file will be |  No separated .class file is generated
 *     generated.                                               |
 *                                                              |
 *  9. Memory will be allocated on-demand whenever we are       |  lambda exp will reside in permanent memory of JVM (Method Area).
 *     creating Anonymous inner class                           |
 *                                                              |
 */

/**
 * Anonymous inner class != Lambda expression.
 */
class Test {
    
}
class AnonymousSample {
    
    public static void main(String[] args) {
        
        Test t = new Test() {
            
        };
        
        TestAbstractClass tac = new TestAbstractClass() {
            
            
        };
        
        SampleInterface si = new SampleInterface() {
            
            @Override
            public void m3() {
                
            }
            
            @Override
            public void m2() {
                
            }
            
            @Override
            public void m1() {
                
            }
        };
        
        SingleMethodInterface smi = new SingleMethodInterface() {
            
            @Override
            public void m1() {
                
            }
        };
    }
}

abstract class TestAbstractClass {
    
}

interface SampleInterface {
    
    void m1();
    void m2();
    void m3();
}

interface SingleMethodInterface {
    void m1();
}

interface Interf {
    void m1();
}
class TestInterf {
    int i = 11;
    
    public void m2() {
        
        Interf in = new Interf() {
            
            //instance variable of Anonymous inner class.
            int i = 99;
            
            @Override
            public void m1() {
                System.out.println(this.i);
            }
        };
        in.m1();
    }
    
    public static void main(String[] args) {
        
        TestInterf ti = new TestInterf();
        ti.m2();
    }
}
/**
 * 
 * 1. we can declare instance variables in Anonymous inner class.
 * 2. Using this keyword inside Anonymous inner class, it refers to Anonymous inner class object.
 */


/**
 * Sample example using Lambda expression
 */

/**
 * Inside lambda expression, it is always a local variable of lambda expression, there is no such instance variable.
 * 
 * this keyword always refers current outer class object.
 */

class TestInterfUsingLambda {
    
    int i = 11;
    
    public void m2() {
        
        Interf in = () -> {
            int i = 99;
            System.out.println(this.i);
        };
        in.m1();
        
    }
    
    public static void main(String[] args) {
        
        TestInterfUsingLambda til = new TestInterfUsingLambda();
        til.m2();
    }
}
/**
 *  checking local and instance level variables in lambda exp.
 */
interface CheckLocalAndInstanceVariablesInLambda {
    
    void m1();
}

class CheckImpl {
    
    int x = 111;
    
    void m2() {
        
        int y = 222;
        
        CheckLocalAndInstanceVariablesInLambda cL = () -> {
            
            x = 333;
            /**
             * 1. local variable used in the lambda expression is automatically a final variable.
             * 2. we can access both instance and method level variable in lambda exp.
             */
//            y = 444;
            System.out.println("X is: " + x);  
            System.out.println("Y is: " + y);
            
        };
        cL.m1();
    }
    
    public static void main(String[] args) {
        
        CheckImpl cI = new CheckImpl();
        cI.m2();
    }
}
/**
 * By the use of Lambda Exp, we can assign function to interface variable.
 * 
 * We can pass procedure directly as argument to the method or even constructor.
 * 
 */
/**
 * Ex:
 * 
 * Interf i = () -> System.out.println("Go");
 * 
 * new Thread(() -> {
 *      System.out.println("Child thread");
 * });
 * 
 * 
 */


/**
 * Advantages of Lambda Exp.
 * 
 * 1. We can enable functional programming in Java.
 * 2. We can reduce length of the code so that readibility will be improved.
 * 3. We can resolve complexity of Anonymous inner class until same extent.
 * 4. We can handle procedures/ functions just like values.
 * 5. We can pass procedures/ functions as arguments.
 * 6. Easier to use updated APIs and libraries.
 * 7. Enable support for parallel processing.
 */

/**
 * Note: DefaultMethodsInsideInterface
 */




