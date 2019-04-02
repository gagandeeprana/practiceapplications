package logical;

public class Test2 {

    public static void main(String[] args) {

        String str = "aaabbbbbbbbbbbbbbbbbbbbbxxxxxzzzzzzzzcccccccccxxxxxxxxx";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if (i != str.length() - 1) {
                while (ch == str.charAt(i + 1)) {
                    i = i + 1;
                    if ((i + 1) == str.length()) {
                        break;
                    }
                }
            }
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
