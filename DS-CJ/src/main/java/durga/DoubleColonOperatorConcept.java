package durga;

/**
 * It can be used for both Method Reference and Constructor reference.
 * Biggest advantage of Method Referencing is code re-usability.
 * 
 * Condition: It is compulsory for both methods (Referral and Referring method) to have same arguments type.
 *
 */
public class DoubleColonOperatorConcept {

    public static void m2(String a) {
        System.out.println("Method Reference m2() " + a);
    }

    public void m3(String a) {
        System.out.println("Method Reference m3() " + a);
    }
    
    public static void main(String[] args) {
        
//        InterfDoubleColon dc = new DoubleColonOperatorConcept() :: m3;
        InterfDoubleColon dc = DoubleColonOperatorConcept :: m2;
        dc.m1("Done");
    }
    
    public void r1() {
        System.out.println("Single Thread.......");
        System.out.println("Method Reference Implementation Runnable interface");
    }
}

interface InterfDoubleColon {
    
    public void m1(String a);
}
class LambdaMethodologyWithoutDoubleColon {
    
    public static void main(String[] args) {
        
        InterfDoubleColon dc = (a) -> {
            System.out.println("Lambda Implementation " + a);
        };
        dc.m1("Done");
    }
}
class RunnableInterfaceUsingMethodReference {
    
    public static void main(String[] args) {
        
        Runnable r = new DoubleColonOperatorConcept() :: r1;
        Thread t = new Thread(r);
        t.start();
    }
}

class RunnableInterfaceUsingLambdaExpression {
    
    public static void main(String[] args) {
        
        Runnable r = () -> {
            System.out.println("Lambda Expression implementation Runnable Interface");
        };
        Thread t = new Thread(r);
        t.start();
        for(int i=0;i<9;i++) {
            System.out.println("Main Thread: " + i);
        }
    }
}

class ConstructorReferenceSample {
    
    public ConstructorReferenceSample() {
        
        System.out.println("Constructor Referencing...");
    }
}

interface InterfConstructoReference {
    
    public ConstructorReferenceSample get();
}
class TestLambdaExpression {
    
    public static void main(String[] args) {
        
        InterfConstructoReference icr = () -> {
            ConstructorReferenceSample crs = new ConstructorReferenceSample();
            return crs;
        };
        icr.get();
    }
}
class TestConstructorReference {
    
    public static void main(String[] args) {
        /**
         * below line is same as get method implementation as done using lambda expression, the code has become shorter.
         */
        InterfConstructoReference icr = ConstructorReferenceSample :: new;
        icr.get();
    }
}
/**
 * Functional interface can refer lambda expression.
 * Alternative to provide implementation like this, instead of lambda expression, it is method reference.
 */

/**
 * Syntax:
 * 
 * Method Referencing
 * ------------------
 * 
 * Static method:   ClassName :: MethodName
 * Instance Method: ClassName :: ReferenceVariable.MethodName
 * 
 * Constructor Referencing
 * -----------------------
 * 
 * ClassName :: new;
 */
/**
 * Next: StreamsConcept
 */









