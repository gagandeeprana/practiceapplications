package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		
		Long date = System.currentTimeMillis();
		Scanner scan = new Scanner(System.in);
	    int noOfCases = scan.nextInt();
	    	
	    int foulCase = 0;
		for(int i=0;i< noOfCases;i++) {
			
			int noOfIntegers = scan.nextInt();
			
			Integer[] integerArray = new Integer[noOfIntegers];
			for(int j=0;j<noOfIntegers;j++) {
				integerArray[j] = Integer.parseInt(scan.next());
			}
			
			Arrays.sort(integerArray);
			int integers = integerArray.length;
				
			int missing = 0;
			int nextValue = 0;
			foulCase = 0;

			if(integers == 1) {
				Integer val = integerArray[0];
				System.out.println(++val);
			}
			
			for(int k=0;k<integers-1;k++) {
				int value = integerArray[k];
				nextValue = integerArray[k+1];
				if((nextValue-value) > 2) {
					foulCase = foulCase + 2;
					break;
				} else if((nextValue-value) > 1) {
					foulCase++;
					missing = ((value + nextValue)/2);
					if(foulCase > 1) {
						break;
					}
				}
			}
			
			
			if(foulCase == 0 && nextValue > 0) {
				System.out.println(nextValue+1);
			} else if(foulCase == 1) {
				System.out.println(missing);
			} else if(foulCase > 1) {
				System.out.println("FOUL");
			}
		}
		System.out.println("Time Taken: " + (System.currentTimeMillis() - date));
	}
}
