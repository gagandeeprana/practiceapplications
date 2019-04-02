package durga;

/**
 * Until 1.7, Every method present inside interface is by default abstract and public. Also,
 * variable is public, static and final by default.
 */
public interface DefaultMethodsInsideInterface {

    /**
     * using default keyword, we can declare default methods.
     * 
     * Implementation class can also override this default method of this interface.
     */
    default void m1() {
        System.out.println("Default Method");
    }
}


class TestDefault implements DefaultMethodsInsideInterface {

    public static void main(String[] args) {
        TestDefault td = new TestDefault();
        td.m1();

    }

    // public void m1() {
    // System.out.println("My implementation");
    // }
}


/**
 * Default methods with respect to multiple interfaces
 * 
 */

interface Left {

    default void m1() {
        System.out.println("Left m1()");
    }
}


interface Right {

    default void m1() {
        System.out.println("Right m1()");
    }
}


/**
 * there is a chance of ambiguity problem when a class overrides default method present in two or
 * more parent interfaces
 * 
 * Error message: class inherits unrelated defaults for m1() types from two interfaces
 */
class BothSides implements Left, Right {

    public void m1() {

        /**
         * if dont want to implement Left or Right interface method implementation, the do below thing
         */
        System.out.println("My implementation");
        
        /**
         * if you want to implement only Left interface method implementation, the do below thing
         * 
         * Interfacename.super.methodName
         */
//        Left.super.m1();
        
    }

    public static void main(String[] args) {
        
        BothSides bs = new BothSides();
        bs.m1();
//        System.out.println(bs.x);
    }
}

abstract class TestAbstract {
    
    int x = 10;
    
    public TestAbstract() {
        System.out.println("Test Abstract Constructor");
    }
    
    static {
        System.out.println("In static block");
    }
    
    {
        System.out.println("Inside instance block");
    }
}

/**
 *                             Interface with default methods Vs Abstract class
 *                                     ******************************************
 *  1. Inside interface every variable is always                |  We can declare instance variables, which are required to 
 *     public, static and final. We cannot declare instance     |  the child class.
 *     variables.                                               |
 *                                                              |
 *  2. Never talks about state of object, because it cannot     |  Abstract class can talk about state of object.
 *     contain instance variables.                              |
 *                                                              |
 *  3. Inside interface, we can't declare constructor.          |  Inside abstract class, we can declare constructor.
 *                                                              |
 *  4. Inside interface, we cannot declare instance             |  Inside abstract class, we can declare instance and static blocks.
 *     and static blocks.                                       |  
 *                                                              |        
 *  5. Functional interface with default methods can            |  Abstract class can't refer Lambda exp.
 *     refer lambda expression                                  |    
 *                                                              |
 *  6. we can't override Object class methods inside interface  |  Inside abstract class we can override Object class methods.
 *                                                              |
 */

/**
 * 
 * From 1.8 version onwards, we can declare static methods inside Interface
 * 
 * Main purpose: Just to provide/ define general utility methods, nowhere related to object state, we can declare these 
 * static methods inside interface.
 * 
 * Interface's static method is bydefault not available to the implementation class.
 * 
 * From 1.8 version onwards, we can declare & execute main method also inside Interface.
 */

interface StaticMethodInterface {
    
    static void m1() {
        
        System.out.println("Interface static method");
    }
    
    public static void main(String[] args) {
        System.out.println("Main method inside Interface");
    }
}
class TestImpl implements StaticMethodInterface {
    
    public static void main(String[] args) {
        
        TestImpl t = new TestImpl();
        /**
         * compile time error for both the cases.
         */
//        t.m1();
//        TestImpl.m1();
        /**
         * only way to access the static method inside the Interface, call with the help of Interface name only.
         */
        StaticMethodInterface.m1();
        
    }
}
/**
 * Overriding concept not applicable to Interface static methods and its implementation class.
 */


/**
 * Note: PredefinedFunctionalInterfaces 
 */

