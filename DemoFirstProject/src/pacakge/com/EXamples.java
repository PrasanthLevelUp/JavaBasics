package pacakge.com;

import java.util.Scanner;

public class EXamples {
	
	int a;
	static Scanner sc;

	public static void main(String[] args) {
		int a;
		int b;		
		sc = new Scanner(System.in);
		System.out.println("Enter the a and b values");
		a = sc.nextInt();
		b = sc.nextInt();
		EXamples ex = new EXamples();
		
		//int c = ex.submethod(a,b);
		//System.out.println(c);
				

	}
	
	public int submethod(int a,int b) {
			
		int c = a+b;
		System.out.println(c);
		return c;
		
		//this.secondsub();
	}
	
	public void secondsub() {
		
		
	}

	
	
}
