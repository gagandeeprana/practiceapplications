package hackerrank;

public class TimeConversion {

    public static void main(String[] args) {
        
        System.out.println(timeConversion("12:59:45AM"));
    }
    
    static String timeConversion(String s) {
        
        String arr[] = s.split(":");
        StringBuilder result = new StringBuilder();
        if(arr[2].contains("PM")) {
            int hh = Integer.parseInt(arr[0]) + 12;
            if(!arr[0].equals("12")) {
                result.append(hh + ":");
            } else {
                result.append(arr[0] + ":");
            }
        } else {
            if(arr[0].equals("12")) {
                result.append("00:");
            }else {
                result.append(arr[0] + ":");
            }
        }
        result.append(arr[1] + ":" + arr[2].substring(0, 2));
        
        return result.toString();
    }
}
