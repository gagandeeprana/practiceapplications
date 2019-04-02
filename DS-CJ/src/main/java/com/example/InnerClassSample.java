package com.example;

public class InnerClassSample {

    public static void main(String[] args) {
        
    }
}
class OuterClass {
    
    static int outerA;
    class InnerClass {
        
        int innerA;
//        static int innerB;
        void m1() {
            outerA = 3;
        }
    }
}
