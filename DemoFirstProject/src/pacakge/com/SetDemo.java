package pacakge.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet();

		set.add("1");
		set.add("fgtdfg");
		System.out.println(set);	


		Iterator it = set.iterator();

		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}

		PriorityQueue pri = new PriorityQueue<>();
		pri.add(3);
		pri.add(3);
		pri.add(6);
		pri.add(7);
		System.out.println(pri);
		pri.remove(6);
		System.out.println(pri);
	}

}
