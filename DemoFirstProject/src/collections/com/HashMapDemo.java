package collections.com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map m = new HashMap();
		m.put(1, "Niho");
		m.put(2, null);
		m.put(2, "Walmart");
		System.out.println(m);
		Set s = m.keySet();		
		Set se = m.entrySet();

		for(var i : s) {
			System.out.println(i + " " + m.get(i));
		}

		for(var i : se) {
			System.out.println(i );
		}


		Hashtable mt = new Hashtable();

		mt.put(1,null);

		System.out.println(mt);

	}
}
