package datastructure;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {
        
        List<Integer> l = new ArrayList<Integer>();
        for(int i=0;i<10;i++)
            l.add(i);
        System.out.println(l);
        l.add(10);
        System.out.println(l);
        l.add(11);
        System.out.println(l);
        
    }
}
