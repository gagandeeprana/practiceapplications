package simpleencryption;

import java.util.Scanner;

public class SimpleEncryption {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no of test cases..");
		int cases = scan.nextInt();
		for(int testCase = 0;testCase < cases; testCase++) {

			System.out.println("Enter key..");
			int key = scan.nextInt();

			System.out.println("Enter encrypted string..");
			String encryptedString = scan.next();
			
			String originalString = "";
			for(int i=0;i<encryptedString.length();i++) {
				char ch = encryptedString.charAt(i);
				int originalInt = ch-key;
				char originalChar = ((char)originalInt);
				originalString += originalChar;
			}
			System.out.println(originalString);
		}
	}
}
