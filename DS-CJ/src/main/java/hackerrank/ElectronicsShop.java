package hackerrank;

public class ElectronicsShop {

    public static void main(String[] args) {

        int keyboards[] = {3, 1};
        int drives[] = {5, 2, 8};
        int b = 10;
        System.out.println(getMoneySpent(keyboards, drives, b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max = -1;

        for (int i = 0; i < keyboards.length; i++) {

            for (int j = 0; j < drives.length; j++) {

                int price = keyboards[i] + drives[j];
                if (price > max && price <= b) {
                    max = keyboards[i] + drives[j];
                }
            }
        }
        return max;
    }

}
