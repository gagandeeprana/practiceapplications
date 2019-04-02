package hackerrank;

public class AngryProfessor {

    public static void main(String[] args) {

        int k = 3;
        int a[] = {-1, -3, 4, 2};
        System.out.println(angryProfessor(k, a));
    }

    static String angryProfessor(int k, int[] a) {

        int onTime = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] <= 0) {
                onTime++;
            }
        }
        if (onTime >= k) {
            return "NO";
        } else {
            return "YES";
        }
    }
}
