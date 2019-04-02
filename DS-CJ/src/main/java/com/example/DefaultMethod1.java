package com.example;

public class DefaultMethod1 {

    public static void main(String[] args) {

        String str = "java";
        str.chars().forEach(ch -> System.out.println((char) ch));
    }
}


@interface Defaulttable {

    int age();
    
    String get() {
        return "";
    }
}


//class DefaulttableImpl implements Defaulttable {
//
//    @Override
//    public int age() {
//        return 6;
//    }
//}
