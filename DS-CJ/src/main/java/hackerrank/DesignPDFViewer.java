package hackerrank;

public class DesignPDFViewer {

    public static void main(String[] args) {

        int h[] = {1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};
        String word = "abc";
        System.out.println(designerPdfViewer(h, word));
    }

    static int designerPdfViewer(int[] h, String word) {

        int base = 97;
        int max = 0;
        for (int i = 0; i < word.length(); i++) {

            if (h[word.charAt(i) - base] > max) {
                max = h[word.charAt(i) - base];
            }
        }

        return word.length() * max;
    }
}
