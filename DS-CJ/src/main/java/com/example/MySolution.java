package com.example;
import java.util.Scanner;
// Other imports go here
  
// Do NOT change the class name
class MySolution {
    public static void main(String[] args) {
        
    	Long startTime = System.currentTimeMillis();
        Scanner scan = new Scanner(System.in);
        int noOfCases = scan.nextInt();
        int validPairs = 0;
		
		for(int i=0;i< noOfCases;i++) {
			
			int noOfBoots = scan.nextInt();
			
			String[] bootArray = new String[noOfBoots];
			for(int j=0;j<noOfBoots;j++) {
                String value = scan.next();
                bootArray[j] = value;
			}
            //System.out.println(noOfBoots);
			validPairs = 0;
			int boots = bootArray.length;
			for(int k=0;k<boots;k++) {
              
				String[] bookArr = bootArray[k].trim().split("");
                            
				int size = Integer.parseInt(bookArr[0]);
                
				String position = bookArr[1];
               
                for(int p=0;p<boots;p++) {
					
                    
					String[] bookArr2 = bootArray[p].trim().split("");
                    
					int size2 = Integer.parseInt(bookArr2[0]);
					String position2 = bookArr2[1];
               
                    if(size == size2) {
						if((position.equals("L") && position2.equals("R")) || (position.equals("R") && position2.equals("L"))
    								|| (position.equals("l") && position2.equals("r")) || (position.equals("r") && position2.equals("l"))) {
						
                            validPairs++;
							bootArray[p] = "99";
							bootArray[k] = "99";
							break;
						}
					}
					
				}
                    
			}
		    System.out.println(validPairs);
		}
		
		System.out.println("Time Taken: " + (System.currentTimeMillis() - startTime));
    }
}
