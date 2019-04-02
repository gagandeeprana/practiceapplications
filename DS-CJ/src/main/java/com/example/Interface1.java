package com.example;

public interface Interface1 {

    void get();
    
    default int set() {
        return 1;
    }
    
    static void main(){
        System.out.println("Great");
    }
}
