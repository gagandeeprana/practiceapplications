package com.example;

import java.util.Scanner;

public class HanoiTower {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int cases = scan.nextInt();
		for(int i=0;i<cases;i++) {
		
			int disks = scan.nextInt();
			int dimensions[][] = new int[disks][2];
			for(int j=0;j<disks;j++) {

				int radius = scan.nextInt();
				int height = scan.nextInt();
				dimensions[j][0] = radius;
				dimensions[j][1] = height;
			}

			int totalHeight = 0;
			for(int j=0;j<dimensions.length;j++) {

				if((dimensions[j][0] > dimensions[j+1][0]) && (dimensions[j][1] > dimensions[j+1][1])) {
						totalHeight += (dimensions[j][1] + dimensions[j+1][1]);
				}
			}
		}
		
	
		scan.close();
	}
}
