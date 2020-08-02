package collections.com;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {

	public static void main(String[] args) {
		
		ConsDemoTest obj = new ConsDemoTest(5,"Audi");
		ConsDemoTest obj2 = new ConsDemoTest(3,"Benz");

		ArrayList cars = new ArrayList();
		cars.add(obj);
		cars.add(obj2);
	
		Iterator it = cars.iterator();

		while(it.hasNext()) {
		
			ConsDemoTest i = (ConsDemoTest) it.next();
			System.out.println("Number " + i.carnumber + "Name " +  i.carname);		
		}
		
		for(Object car : cars) {
			ConsDemoTest i = (ConsDemoTest) car;
			i.test();
			System.out.println("Number " + i.carnumber + "Name " +  i.carname);
		}

			
	
		
		ArrayList<Integer> li = new ArrayList();
		ArrayList li3 = new ArrayList(20);

		if(li.isEmpty()) {

		}

		li.add(2);
		li.add(4);
		li.add(8);
		li.add(1, 10);		
		System.out.println(li);
		System.out.println(li.get(3));
		li.remove(true);
		System.out.println(li);


		java.util.Collections.sort(li);
		System.out.println(li);
		ArrayList li2 = new ArrayList();
		li2.addAll(li);
		if(li.contains("inho")) {

		}else {

		}

		for(int i =0;i<li.size();i++) {

		}
		
		li.forEach(a->{
			System.out.println("Foreach mehtod: "+a);
		});

		for(int i : li) {

		}

		Iterator it1 = li.iterator();

		while(it1.hasNext()) {
			System.out.println("Iterator Method: " +it1.next());
		}




	}

}
