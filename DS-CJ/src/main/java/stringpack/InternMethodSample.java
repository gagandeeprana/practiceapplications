package stringpack;

public class InternMethodSample {

    public static void main(String[] args) {
        
        String s1 = "Java";
        String s2 = "java";
        System.out.println(s2.intern() == s1.intern());
        
    }
}
