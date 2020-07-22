package pacakge.com;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(4);
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		System.out.println(list.get(0));
	list.remove(0);
		list.add(0, 10);
		System.out.println(list);
		
		/*ArrayList list2 = new ArrayList();
		list2.addAll(list);
		if(list.contains(10)) {
			System.out.println("true");
		}else {
			
		}*/
		
		LinkedList<Integer>  lnk  = new LinkedList<Integer>();
		lnk.add(2);
		lnk.add(2);
		lnk.add(6);
		lnk.add(8);
		System.out.println(lnk);
		System.out.println(lnk.peek());
		System.out.println(lnk);
		System.out.println(lnk.poll());
		System.out.println(lnk);
		
	
	}

}
