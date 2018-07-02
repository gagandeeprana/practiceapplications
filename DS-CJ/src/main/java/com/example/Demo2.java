package com.example;

import java.util.Arrays;

/**
 * 
 * @author gagandeep.rana
 *	Binary Search Algorithm
 */
public class Demo2 {

	// 13, 45, 65, 78, 95
	
	int index;
	int items[] = new int[10];
	int lowerBound, upperBound;
	int noOfItems = 0;
	
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		obj.initialInsert();
		Arrays.sort(obj.items);
		obj.noOfItems = obj.items.length;
//		System.out.println(obj.find(99));
		System.out.println("Insert: " + obj.insert(96));
		System.out.println("Display: " + obj.displayItems());
	}
	
	private String initialInsert() {
		items[0] = 13;
		items[1] = 45;
		items[2] = 65;
		items[3] = 78;
		items[4] = 95;
		items[5] = 97;
		items[6] = 99;
		return "Inserted successfully";
		
	}
	
	private String displayItems() {
	        
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<noOfItems;i++) {
	
			sb.append(items[i] + ", ");
		}
		return sb.toString();
//		return sb.toString().substring(0, sb.toString().lastIndexOf(","));

	}
	
	private String insert(int insertKey) {
		int i=0;
		for(i = 0; i < noOfItems; i++) {
			/*if(items[i] > insertKey) {
				for(int j=noOfItems-1;j>i;j--) {
					items[j] = items[j - 1];
				}
				items[i] = insertKey;
				break;
			}*/
			int firstElement = items[i];
			int secondElement = 0;
			if(i< noOfItems){
				secondElement = items[i+1];
			}
			
			if(insertKey > firstElement && insertKey < secondElement){
				for (int j = items.length - 1; j > (i+1); j--) {
					items[j+1] = items[j];
				}
				
				items[i+1] = insertKey;
			}
		}
//		noOfItems++;
		return insertKey + " inserted at index " + i;
	}
	
	private String find(int searchKey) {
		lowerBound = 0;
		upperBound = items.length - 1;
		while(true) {
			
			/**
			 * this step finds the center index
			 */
			
//			System.out.println(" lowerbound:  " + lowerBound + "  upperBound:  " + upperBound);
			index = (lowerBound + upperBound) / 2;
			
			if(items[index] == searchKey) {
				
				return "element " + searchKey + " found at " + index + " index";
			
			} else if(lowerBound > upperBound) {
			
				return "not found";
			
			} else {
				
				if(items[index] < searchKey)
					lowerBound = index + 1;
				else
					upperBound = index - 1;
			}
		}
	}
}
