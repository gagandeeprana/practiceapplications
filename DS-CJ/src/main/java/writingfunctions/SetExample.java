package writingfunctions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class SetExample {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add(null);
		set.add("A");
		set.add("B");
		set.add("C");
		System.out.println("******");
		System.out.println(set);
		//=============================
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aa");
		map.put(null, "bb");
		System.out.println(map);

		//=============
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(1, "aa");
		table.put(null, "bb");
		System.out.println(table);
		
		//================================
//		Collections.copy(set, map);
//		List<String> ll = new ArrayLIs
		
		
	}
}
