package collections.com;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PrioityDemo {

	public static void main(String[] args) {
		Queue p = new PriorityQueue();
		Queue p1 = new LinkedList();

		
		p.add(4);
		System.out.println(p);
		p.add(5);
	
		System.out.println(p);
		p.add(6);
		p.add(7);
		System.out.println(p);
		p.remove();
		p.add(8);
		System.out.println(p);
		
		//p.add(9);
		System.out.println(p);
		p.remove();
		
		System.out.println(p);
		System.out.println(p.peek());

		p1.offer(7);
		p1.add(4);
		System.out.println(p1);
		p1.add(5);
		p1.offer(9);
		System.out.println(p1);
		p1.add(6);
		System.out.println(p1);
		p1.poll();
		System.out.println(p1);
		p1.remove();
		System.out.println(p1);
		System.out.println(p1.peek());


	}

}
