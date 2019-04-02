package com.example;

public class Functional1 {

    public static void main(String[] args) {
        
        
    }
}
@FunctionalInterface
interface TestFunctional {
    
    int calculate();
//    int aggregate();
    default int max() {
        
        return 0;
    }
}
