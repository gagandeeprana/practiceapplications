package com.example;

import java.util.Optional;


public class Optional1 {

    public static void main(String[] args) {

        // old methodlogy
        // String[] arr = new String[3];
        // String op = arr[2].toLowerCase();
        // System.out.println(op);

        String[] arr = new String[3];
        Optional<String> optional = Optional.ofNullable(arr[2]);
        if (optional.isPresent()) {
            String op = arr[3];
            System.out.println(op);
        } else {
            System.out.println("No such index");
        }
    }
}
