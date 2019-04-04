package hackerrank;


public class CountingValleys {

    static int countingValleys(int n, String s) {

        int counter = 0;
        int valleys = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch == 'U') {
                counter++;
            } else {
                counter--;
            }

            if (s.charAt(i) == 'U' && counter == 0) {
                valleys++;
            }
        }
        return valleys;
    }

    public static void main(String[] args) {

        // int n = 8;
        int n = 12;
        // String s = "UDDDUDUU";
        String s = "DDUUDDUDUUUD";
        System.out.println(countingValleys(n, s));
    }
}
