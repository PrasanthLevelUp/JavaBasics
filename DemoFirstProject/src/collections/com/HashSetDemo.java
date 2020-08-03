package collections.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet  h = new HashSet<>();

		h.add(5);
		h.add(6);
		h.add(5);
		System.out.println(h);
		Iterator it = h.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}	
		System.out.println(h);
	}

}
