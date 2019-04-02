package logical;

import java.util.ArrayList;
import java.util.List;

public class ReturnLogic {

    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<Integer>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(m1(l).size());
    }
    
    static List<Integer> m1(List<Integer> l) {
        m2(l);
        return l;
    }
    
    static void  m2(List<Integer> l) {
        l.add(5);
        
    }
}
