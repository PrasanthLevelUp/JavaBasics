package collections.com;

import java.util.Deque;
import java.util.LinkedList;

public class DequetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque 
        = new LinkedList<String>(); 

    // We can add elements to the queue 
    // in various ways 

    // Add at the last 
    deque.add("Element 1 (Tail)"); 
    System.out.println(deque); 
 // Add at the last 
    deque.add("Element 1 (Tail2)"); 
    System.out.println(deque); 

    // Add at the first 
    deque.addFirst("Element 2 (Head)"); 
    System.out.println(deque); 
    
    // Add at the last 
    deque.addLast("Element 3 (Tail)"); 
    System.out.println(deque); 

    // Add at the first 
    deque.push("Element 4 (Head)"); 
    System.out.println(deque); 

    // Add at the last 
    deque.offer("Element 5 (Tail)"); 
    System.out.println(deque); 

    // Add at the first 
    deque.offerFirst("Element 6 (Head)");

    System.out.println(deque + "\n"); 

    // We can remove the first element 
    // or the last element. 
    deque.removeFirst(); 
    deque.removeLast(); 
    System.out.println("Deque after removing "
                       + "first and last: "
                       + deque); 
	}

}
