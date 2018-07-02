package com.example;

public class Demo8 {

	public static void main(String[] args) {
		
		try {

			System.out.println("0");
			System.out.println(1/0);
			System.out.println("1");
		} catch (Exception e) {
			System.out.println("2");
		}
		System.out.println("3");
		System.out.println("4");
		System.out.println("5");
	}
}
