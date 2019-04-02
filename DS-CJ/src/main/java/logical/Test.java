package logical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {

    Map<String, String> map = new HashMap<String, String>();
    
    public static void main(String[] args) {

        List<Map<String, String>> lmap = new ArrayList<Map<String, String>>();
        Test t = new Test();

        Map<String, String> m1 = new HashMap<String, String>();
        m1.put("a", "a1");
        Map<String, String> m2 = new HashMap<String, String>();
        m2.put("a", "a2");
        Map<String, String> m3 = new HashMap<String, String>();
        m3.put("a", "a3");
        Map<String, String> m4 = new HashMap<String, String>();
        m4.put("a", "a4");
        Map<String, String> m5 = new HashMap<String, String>();
        m5.put("a", "a5");

        lmap.add(m1);
        lmap.add(m2);
        lmap.add(m3);
        lmap.add(m4);
        lmap.add(m5);

        String val = "a5";
        
        t.map.put("a", "a5");
    }
    
    
    
}
