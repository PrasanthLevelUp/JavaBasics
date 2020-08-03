package collections.com;

import java.util.PriorityQueue;

public class PrioityDemo {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		PriorityQueue p1 = new PriorityQueue<>();
		
	
		
		p.add(4);
		p.add(5);
		p.add(6);

		System.out.println(p);
		p.poll();
		System.out.println(p);
		
		System.out.println(p.peek());
		

	}

}
