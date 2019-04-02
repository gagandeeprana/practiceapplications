package codility;

public class FrogJump {

    public static void main(String[] args) {

        System.out.println(new FrogJump().solution(5, 105, 3));
    }

    public int solution(int X, int Y, int D) {

        if ((Y - X) % D == 0) {
            return ((Y - X) / D);
        } else {
            return ((Y - X) / D) + 1;
        }
    }
}
