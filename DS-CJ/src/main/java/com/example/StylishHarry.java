package com.example;

import java.util.Scanner;

public class StylishHarry {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		for(int i=0;i<cases;i++) {
			
			int judges = scan.nextInt();
			int[] points = new int[judges];
			for(int j=0;j<judges;j++) {
				points[j] = scan.nextInt();
			}
			
			int sumOdd = 0;
			int sumEven = 0;
			for(int j=0;j<points.length;j++) {
				
				sumOdd = sumOdd + points[j];
				if(j != points.length - 1){
					j++;
				}
			}
			for(int j=0;j<points.length;j++) {
				
				if(j != points.length - 1){
					j++;
				} else {
					break;
				}
				sumEven = sumEven + points[j];
			}
			
			System.out.println(sumEven + " " + sumOdd);
			if(sumEven > sumOdd) {
				System.out.println("Case " + (i+1) + ": " + sumEven);
			} else {
				System.out.println("Case " + (i+1) + ": " + sumOdd);
			}
		}
		scan.close();
	}
}
