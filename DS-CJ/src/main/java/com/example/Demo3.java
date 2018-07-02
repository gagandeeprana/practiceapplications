package com.example;

import java.util.Scanner;

public class Demo3 {

	public static void main(String[] args) {
		
//		System.out.println("Enter no. of Test Cases");
		Scanner scanner = new Scanner(System.in);
		int cases = scanner.nextInt();
		int minScore = 30;
		boolean notMade = false;
		
		for (int i = 0; i < cases; i++) {
			
//			System.out.println("Enter the no. of Students");
			int students = scanner.nextInt();
			
//			int academics[] = {60, 40, 70, 60, 80, 90, 20, 30};
//			int sports[] = {60, 80, 40, 60, 80, 30, 80, 100};
//			int communications[] = {40, 60, 50, 40, 0, 40, 60, 30};
			int academics[] = new int[students];
			int sports[] = new int[students];
			int communications[] = new int[students];

			for(int j=0;j<students;j++) {
//				System.out.println("Enter " + j + " student Academics marks");
				academics[j] = scanner.nextInt();
				if(j == 0 && (academics[j] < minScore)) {
					notMade = true;
				}
			}
			
			for(int j=0;j<students;j++) {
//				System.out.println("Enter " + j + " student Sports marks");
				sports[j] = scanner.nextInt();
				if(j == 0 && (sports[j] < minScore)) {
					notMade = true;
				}
			}
			
			for(int j=0;j<students;j++) {
//				System.out.println("Enter " + j + " student Communication marks");
				communications[j] = scanner.nextInt();
				if(j == 0 && (communications[j]<minScore)) {
					notMade = true;
				}
			}

			if(!notMade) {

				int resultArray[] = new int[students];
				for(int j=0;j<students;j++) {
					resultArray[j] = (academics[j] + sports[j] + communications[j]);
				}
				
				int madeIt = 0;
				for(int j=0;j<resultArray.length - 1;j++) {
					
					if(resultArray[0] > resultArray[j+1]) {
						
						madeIt++;
						
					} else if(resultArray[0] == resultArray[j+1]) {
						if(academics[0] > academics[j+1]) {
							
							madeIt++;
							
						} else if(academics[0] == academics[j+1]){
							
							if(sports[0] > sports[j+1]) {
								madeIt++;
							}
						}
					}
				}
				if(students >= 3) {
					if((students - madeIt) <= 3)
						System.out.println("YES");
					else
						System.out.println("NO");
				} else {
					System.out.println("YES");
				}
			
			} else {
				System.out.println("NO");
			}
		}
	}
}
