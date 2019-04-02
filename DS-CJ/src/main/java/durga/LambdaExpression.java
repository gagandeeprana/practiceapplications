package durga;

public class LambdaExpression {

    /**
     * 
     * benefits
     * 1. to enable functional programming in java
     * 2. to write more readable, maintainable, clean & concise code in java
     * 3. to use apis very easily effectively
     * 4. to enable parallel processing also.
     * 
     * Lambda expression is an anonymous function(name less function).
     * It is not having name, modifiers and any return type.
     */
    
    public static void main(String[] args) {
        
//        () -> {System.out.println("Great"); }
    
//        (int a, int b) -> {System.out.println(a+b);}
    /**
     * based on the context the compiler has guess the types automatically, this is known as TYPE INFERENCE.
     */
        /**
         * data types are also optional.
         */
//        (a, b) -> System.out.println(a+b);
        
//        (String a) ->{return a.length();}
        /**
         * return keyword is optional
         */
//        (a) -> {a.length();}
            /**
             * () paranthesis are also optional incase of single parameter.
             */
//        a -> a.length();
    }
}
/**
 * Next: FunctionalInterfaceDemo
 * 
 */





