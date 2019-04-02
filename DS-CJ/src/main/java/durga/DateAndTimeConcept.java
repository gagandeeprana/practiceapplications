package durga;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Scanner;

/**
 * Date, Calendar, TimeStamp in java1.7
 * most of the methods are deprecated in these classes.
 * 
 * Java 1.8 Date & Time API also known as joda time api
 * This api developed by joda.org
 *
 */
public class DateAndTimeConcept {

    public static void main(String[] args) {
        
        /**
         * These classes are present inside java.time package
         */
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        System.out.println("Day: " + localDate.getDayOfMonth());
        System.out.println("Month in String: " + localDate.getMonth());
        System.out.println("Month in Integer: " + localDate.getMonthValue());
        System.out.println("Year: " + localDate.getYear());
        System.out.printf("%d-%d-%d", localDate.getDayOfMonth(),localDate.getMonthValue(),localDate.getYear());
        
        System.out.println();
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        int h = localTime.getHour();
        int m = localTime.getMinute();
        int s = localTime.getSecond();
        int ns = localTime.getNano();
        System.out.printf("%d:%d:%d:%d",h,m,s,ns);
        
        System.out.println();
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);
        int dd = ldt.getDayOfMonth();
        int MM = ldt.getMonthValue();
        int yyyy = ldt.getYear();
        int hh = ldt.getHour();
        int mm = ldt.getMinute();
        int ss = ldt.getSecond();
        int nsds = ldt.getNano();
        System.out.printf("%d-%d-%d",dd,MM,yyyy);
        System.out.println();
        System.out.printf("%d:%d:%d:%d",hh,mm,ss,nsds);
        
//        LocalDateTime ldtt = LocalDateTime.of(yyyy, MM, dd, h, mm);
        LocalDateTime ldtt = LocalDateTime.of(1995, Month.MAY, 28, 12, 45);
        System.out.println("\n"+ldtt);
        System.out.println("After 6 months: " + ldtt.plusMonths(6));
        System.out.println("Before 6 months: " + ldtt.minusMonths(6));
        
        LocalDate birth = LocalDate.of(1988, 9, 29);
        LocalDate today = LocalDate.now();
        Period p = Period.between(birth, today);
        System.out.println();
        System.out.printf("Your Age is %d years %d months and %d days ", p.getYears(), p.getMonths(), p.getDays());

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your number");
        int n = scanner.nextInt();
        Year y = Year.of(n);
        if(y.isLeap()) {
            System.out.printf("%d year is leap year", n);
        } else {
            System.out.printf("%d year is not a leap year", n);
        }
        
        if(scanner != null) {
            scanner.close();
        }
        
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("\n" + zoneId);
        
        ZoneId la = ZoneId.of("America/Los_Angeles");
        System.out.println(la);
        ZonedDateTime zoned = ZonedDateTime.now(la);
        System.out.println(zoned);
        
    }
}
