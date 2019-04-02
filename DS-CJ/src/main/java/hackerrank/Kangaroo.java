package hackerrank;

public class Kangaroo {

    public static void main(String[] args) {

        // System.out.println(kangaroo(0, 3, 4, 2));
         System.out.println(kangaroo(21, 6, 47, 3));
//        System.out.println(kangaroo(14, 4, 98, 2));
//        System.out.println(kangaroo(42, 3, 94, 2));
    }

    static String kangaroo(int x1, int v1, int x2, int v2) {

       /* if (x2 != 0 && x1 != 0) {
            if (x2 > x1) {
                if (v2 > v1) {
                    return "NO";
                } 
                else {
                    if (x2 % x1 != 0) {
                        return "NO";
                    }
                }
            } else if (x1 > x2) {
                if (v1 > v2) {
                    return "NO";
                }
                else {
                    if (x1 % x2 != 0) {
                        return "NO";
                    }
                }
            }
        }
        int i = 1;
        int kangarooFirst = 0;
        int kangarooSecond = 0;
        while (i > 0) {

            kangarooFirst = (v1 * i) + x1;
            kangarooSecond = (v2 * i) + x2;

            if (kangarooFirst == kangarooSecond) {
                return "YES";
            }
            i++;
        }
        return "NO";*/
        
        if (x2 != 0 && x1 != 0) {
            if (x2 > x1) {
                if (v2 > v1) {
                    return "NO";
                } 
            } else if (x1 > x2) {
                if (v1 > v2) {
                    return "NO";
                }
            }
        }
        int i = 1;
        int kangarooFirst = 0;
        int kangarooSecond = 0;
        while (i > 0) {

            kangarooFirst = (v1 * i) + x1;
            kangarooSecond = (v2 * i) + x2;

            if(kangarooFirst < 0 || kangarooSecond < 0) {
                return "NO";
            }
            if (kangarooFirst == kangarooSecond) {
                return "YES";
            }
            i++;
        }
        return "NO";
    }
}
