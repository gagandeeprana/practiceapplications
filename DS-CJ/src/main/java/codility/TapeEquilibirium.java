package codility;

public class TapeEquilibirium {

    public static void main(String[] args) {

        // int A[] = {5, 6, 2, 4, 1};
        // int A[] = {3, 1, 2, 4, 3};
        // int A[] = {-1000, 1000};
        int A[] = {-10, -5, -3, -4, -5};
        System.out.println(new TapeEquilibirium().solution(A));
    }

    public int solution(int A[]) {

        long stTime = System.currentTimeMillis();
        int diff = 0;
        int first = 0;
        int sum = 0;
        for (int j = 1; j < A.length; j++) {

            sum = sum + A[j];
        }
        first = A[0];
        diff = Math.abs(first - sum);
        for (int i = 1; i < A.length - 1; i++) {

            int index = i;
            first = first + A[index];

            sum = sum - A[index];

            if (diff > Math.abs(first - sum)) {
                diff = Math.abs(first - sum);
            }
        }
        System.out.println("Time:" + (System.currentTimeMillis() - stTime));
        return diff;
    }
}
