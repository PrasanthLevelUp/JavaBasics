package collections.com;

import java.util.ArrayList;

public class Dupli {

	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<String>();
		li.add("A");
		li.add("B");
		li.add("B");
		li.add("A");
		for(int i=0;i<li.size();i++) {
			for(int j=i+1;j<li.size();j++) {				
				if(li.get(j).equals(li.get(i))) {
					System.out.println("Duplicate: " +li.get(i));
					break;
				}		
			}

		}
	}
}
