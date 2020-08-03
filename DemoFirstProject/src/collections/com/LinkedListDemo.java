package collections.com;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> li = new LinkedList();
		
		li.add(5);
		li.add(8);
		li.add(7);
		li.add(2);
		
		System.out.println(li);		
		System.out.println(li.peek());	
		System.out.println(li);
		System.out.println(li.poll());
		System.out.println(li);
			
		li.push(5);
		System.out.println(li);
		
		li.addLast(9);
		System.out.println(li);
		
		System.out.println(li.get(0));
		System.out.println(li.getFirst());
		System.out.println(li.getLast());
		
	}

}
