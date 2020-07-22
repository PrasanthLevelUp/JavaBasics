package pacakge.com;

import secondPackage.Test;

public class LoopsDemo {

	public static void main(String[] args) {
int j=0;


Test obj = new Test();
obj.sub(5);
obj.i= 10;

		for(int  i =0;i<10;i++) {
			System.out.println(i);
			
		}
		
		while(j<10) {
			
		j++;	
		}
		
do {
	
}while(!(j==10));
	

/**
**
***
****
******/

	
	int a = 0;
	int b= 1;
	int c;
	
	for(int k=1;k<=10;k++) {
		
		c= a+b;
		a=b;
		b=c;
		System.out.println(c);
	}

}
}
