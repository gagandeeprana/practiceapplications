package com.example;

import java.time.Clock;
import java.util.stream.Stream;

public class MethodReference1 {

    public static void main(String[] args) {

        String[] languages = {"Java", "Python", "C"};
        Stream<String> st = Stream.of(languages);
        st.forEach(System.out::println);

        Clock.systemUTC();

    }
}
