package hackerrank;

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {

        int c[] = {0, 0, 1, 0, 0, 1, 1, 0};
        int k = 2;
        System.out.println(jumpingOnClouds(c, k));
    }

    static int jumpingOnClouds(int[] c, int k) {

        int power = 100;

        int i = 0;
        boolean last = false;
        while (i < c.length) {

            i += k;
            if (i >= c.length) {
                i = 0;
                last = true;
            }
            if (c[i] == 0) {

                power--;
            } else {
                power = power - 3;
            }
            if (last) {
                break;
            }
        }

        return power;
    }
}
