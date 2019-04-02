package codility;

public class BinaryGap {

    public static void main(String[] args) {

        int n = 20;
        System.out.println(new BinaryGap().solution(n));
    }

    int solution(int n) {

        StringBuilder sb = new StringBuilder();

        while (n >= 2) {
            sb.append(n % 2);
            n /= 2;
        }
        sb.insert(sb.length(), n);
        sb.reverse();
        // sb.substring(sb.indexOf("1"), sb.length());

        String str = sb.toString();
        int max = 0;
        while (str.indexOf("1") != -1) {

            int first = str.indexOf("1");
            if (first > max) {
                max = first;
            }
            str = str.substring(first + 1, str.length());
        }

        return max;
    }
}
