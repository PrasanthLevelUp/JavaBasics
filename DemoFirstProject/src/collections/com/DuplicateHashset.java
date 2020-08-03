package collections.com;

import java.util.HashSet;

public class DuplicateHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] c = {'t','d','t','a'};
		
		
		HashSet s = new HashSet();
		
		for(int i=0;i<c.length;i++) {
			
		/*	if(s.contains(c[i])) {
				System.out.println("Duplicate: " + c[i]);
			}else {
				s.add(c[i]);
			}*/
			
			if(!s.add(c[i])) {
				System.out.println("Duplicate: " + c[i]);
			}
			
		}		
			
	}

}
