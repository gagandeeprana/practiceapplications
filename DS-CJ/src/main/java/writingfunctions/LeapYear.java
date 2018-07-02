package writingfunctions;

public class LeapYear {

	public String isLeapYear(int year) {
		// Complete this function
		if(year % 4 == 0) {
			return "Leap year";
		} else {
			return "Not a leap year";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(new LeapYear().isLeapYear(2100));
	}
}
