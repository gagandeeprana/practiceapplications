package com.example;

import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        System.out.println(hm.put(null, "A"));
        System.out.println(hm.put(1, "G"));
        System.out.println(hm.put(1, "G"));
        System.out.println(hm.put(1, "B"));
        System.out.println(hm.put(1, "C"));
        System.out.println(hm.get(null));
//        System.out.println(hm.get(1));
    }
}
