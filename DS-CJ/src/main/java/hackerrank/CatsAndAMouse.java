package hackerrank;

public class CatsAndAMouse {

    public static void main(String[] args) {

//        int x = 1;
//        int y = 2;
//        int z = 3;
        int x = 1;
        int y = 3;
        int z = 2;
        System.out.println(catAndMouse(x, y, z));
    }

    static String catAndMouse(int x, int y, int z) {

        String result = "Mouse C";
        if (Math.abs(z - y) > Math.abs(z - x)) {
            result = "Cat A";
        } else if (Math.abs(z - y) < Math.abs(z - x)) {
            result = "Cat B";
        }
        return result;

    }
}
