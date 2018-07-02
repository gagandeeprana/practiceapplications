package com.example;

/**
 * Demo1
 *	Array Operations
 */
public class Demo1 
{
	Long arrayItems[] = null;
//	static Long arrayItems[] = {21l, 76l, 45l, 72l, 49l};

	static Long searchKey = 76l;
	int noOfElements = 0;
	
	public Demo1(int size) {
		arrayItems = new Long[size];
	}
	
	public void setElement(int index, Long value) {
		arrayItems[index] = value;
	}
	
	public Long getElement(int index) {
		return arrayItems[index];
	}
	
	public int getSize() {
		return arrayItems.length;
	}
	
	public static void main( String[] args ) {
		Demo1 obj = new Demo1(5);
		obj.setElement(0, 21l);
		obj.setElement(1, 76l);
		obj.setElement(2, 45l);
		obj.noOfElements = obj.getSize();
		String displayItems = obj.displayItems();
		System.out.println("Display: " + displayItems);
		String result = obj.searchItem(searchKey);
		System.out.println("Searching: " + result);
		String delResult = obj.deleteItem(76l);
		System.out.println("Delete: " + delResult);
		String searchResult = obj.searchItem(searchKey);
		System.out.println("Searching: " + searchResult);
		String displayResult = obj.displayItems();
		System.out.println("Display: " + displayResult);
    }
    
    private String searchItem(Long searchKey) {
    
    	for(int i=0;i<noOfElements;i++) {
    		
    		if(arrayItems[i] == searchKey) {
    			return searchKey + " is found at " + i + " index";
    		}
    	}
    	return searchKey + " not found";
    }
    
    private String displayItems() {
        
    	StringBuilder sb = new StringBuilder();
    	
    	for(int i=0;i<noOfElements;i++) {

    		sb.append(arrayItems[i] + ", ");
    	}
    	return sb.toString().substring(0, sb.toString().lastIndexOf(","));
    }
    
    private String deleteItem(Long deleteKey) {
        
    	int deletedIndex = 0;
    	for(int i=0;i<noOfElements;i++) {

    		if(arrayItems[i] == deleteKey) {
    			deletedIndex = i;
    			for(int j=i;j<arrayItems.length - 1;j++) {
    				setElement(j, arrayItems[j + 1]);
    			}
    			noOfElements--;
    			break;
    		}
    	}
    	if(deletedIndex != 0) {
    		return deleteKey +" deleted from " + deletedIndex + " index";
    	} else {
    		return "no such element found in the array"; 
    	}
    }
    
    
} 
