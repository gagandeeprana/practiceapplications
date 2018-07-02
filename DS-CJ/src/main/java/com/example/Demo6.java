package com.example;

public class Demo6 {

	public static void main(String[] args) {
		
		int noOfCases = 1;
		
		
		for(int i=0;i< noOfCases;i++) {
			
			int noOfBoots = 5;
			
			String[] bootArray = new String[noOfBoots];
//			for(int j=0;j<noOfBoots;j++) {
				
				
//				bootArray[j] =  
				bootArray[0] = "5L";
				bootArray[1] = "5L";
				bootArray[2] = "5R";
				bootArray[3] = "5R";
				bootArray[4] = "5R";
				
				
				
//			}
				int validPairs = 0;
				int boots = bootArray.length;
				for(int k=0;k<boots;k++) {
					String boot = bootArray[k];
					String size = boot.split("")[0];
					String position = boot.split("")[1];
					
					for(int l=0;l<boots;l++) {
						
						String boot2 = bootArray[l];
						String size2 = boot2.split("")[0];
						String position2 = boot2.split("")[1];

						
						if(size == size2) {
							if((position.equals("L") && position2.equals("R")) || (position.equals("R") && position2.equals("L"))
									|| (position.equals("l") && position2.equals("r")) || (position.equals("r") && position2.equals("l"))) {
								validPairs++;
								bootArray[l] = "ZZ";
								bootArray[k] = "ZZ";
								break;
							}
						}
						
					}
				}
				System.out.println(validPairs);
		}
	}
}
