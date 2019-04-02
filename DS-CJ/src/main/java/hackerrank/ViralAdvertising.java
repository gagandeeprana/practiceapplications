package hackerrank;

public class ViralAdvertising {

    public static void main(String[] args) {

        System.out.println(viralAdvertising(3));
    }

    static int viralAdvertising(int n) {

        int shared = 5;
        int liked = 2;
        int cumulative = liked;
        for (int i = 2; i <= n; i++) {

            shared = liked * 3;
            liked = shared / 2;
            cumulative += liked;
        }
        return cumulative;
    }
}
