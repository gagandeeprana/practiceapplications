package com.example;

import java.util.Scanner;

public class MonkTravelling {

	/*public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		for(int i=0;i<testCases;i++) {
			
			int noOfCheckpoints = scan.nextInt();
			int C[] = new int[noOfCheckpoints];
			int L[] = new int[noOfCheckpoints];

			for(int j=0;j<noOfCheckpoints;j++) {
				
				C[j] = scan.nextInt();
				L[j] = scan.nextInt();
			}
			
			int leastCostIndex = 0;
			int leastCostValue = C[0];
			for(int j=0;j<noOfCheckpoints;j++) {
			
				for(int k=j+1;k<noOfCheckpoints;k++) {

					if(C[k] < leastCostValue) {
						leastCostIndex = k;
						leastCostValue = C[k];
					}
					
				}
			}
			int totalAmount = 0;
			for(int j=0;j<noOfCheckpoints;j++) {
				
				if(j == 0 && (C[j] == leastCostValue)) {

					for(int k=0;k<noOfCheckpoints;k++) {
						totalAmount = totalAmount + (C[j]*L[k]);
					}
					break;
				}
				if(j == 0) {
					totalAmount = (C[j]*L[j]);
				}
				if(C[j] == leastCostValue) {
					
					for(int k=leastCostIndex;k<noOfCheckpoints;k++) {
						totalAmount = totalAmount + (C[j]*L[k]);
					}
					break; 
				}
			}
			System.out.println(totalAmount);
		}
		scan.close();
	}*/
	
	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		int testCases = scan.nextInt();
		for(int i=0;i<testCases;i++) {
			
			int noOfCheckpoints = scan.nextInt();
			int C[] = new int[noOfCheckpoints];
			int L[] = new int[noOfCheckpoints];

			for(int j = 0; j < noOfCheckpoints; j++) {
				
				C[j] = scan.nextInt();
			}
			
			for(int j = 0; j < noOfCheckpoints; j++) {
				
				L[j] = scan.nextInt();
			}


			int totalAmount = 0;
			int leastValue = C[0];
			for(int j=0;j<noOfCheckpoints;j++) {
				
				if(j == 0) {
					totalAmount = (leastValue*L[j]);
				}
			
				if(j != 0) {
					
					if(j == noOfCheckpoints-1) {
						
						if((C[j] < C[j-1]) && (C[j] < leastValue)) {
							
							leastValue = C[j];
						}
					} else {
						
						if(C[j] < C[j-1]) {
							leastValue = C[j];
						}
						
						if((C[j] < C[j+1]) && (C[j] < leastValue)) {
							
							leastValue = C[j];
						}
					}
					totalAmount = totalAmount + (leastValue*L[j]);
				}
				scan.nextLine();
			}
			System.out.println(totalAmount);
		}
		scan.close();
	}
}
