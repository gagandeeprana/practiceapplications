package hackerrank;

public class DayOfTheProgrammer {

    public static void main(String[] args) {

//         System.out.println(dayOfProgrammer(2016));
         System.out.println(dayOfProgrammer(1918));
//        System.out.println(dayOfProgrammer(1700));
        // System.out.println(dayOfProgrammer(2100));
    }

    static String dayOfProgrammer(int year) {

        String dt = "";
        // if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        if (year > 1918 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            dt = "12.09." + year;
        } else if(year < 1918 && year % 4 == 0){
            dt = "12.09." + year;
        } else if(year == 1918){
            dt = "26.09." + year;
        } else {
            dt = "13.09." + year;
        }
        return dt;
    }
}
