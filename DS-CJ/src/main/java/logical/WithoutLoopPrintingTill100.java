package logical;

public class WithoutLoopPrintingTill100 {

    public static void main(String[] args) {

        usingRecursion(100);
    }

    public static void usingRecursion(int number) {
        if (number > 1) {
            usingRecursion(number - 1);
        }
        System.out.println(number);
    }

}
