package pacakge.com;

public class BClasss extends AClass{

	public static void main(String[] args) {
		
		AClass ob = new AClass();
		ob.show();
			
		BClasss obj = new BClasss();
		obj.show();
		obj.test();
		obj.range(5);	
		
	}
	
	public void range(int a) {
		
		super.range();
	}

}
