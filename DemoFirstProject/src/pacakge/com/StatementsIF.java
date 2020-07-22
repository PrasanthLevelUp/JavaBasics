package pacakge.com;

public class StatementsIF {
	
	static int a;

	public static void main(String[] args) {

		StatementsIF sdf= new StatementsIF();
		sdf.ddd();
		a=10;
		
		StatementsIF.ddd();
		String str = "one";

		if(str.equals("one")) {			
			System.out.println("Pass");
		}else if(str.equals("two")){		
			System.out.println("Fail");
		}else if(str.equals("three")) {
			System.out.println("Fail");
		}

		int i =10;
		
		switch(i){
		case 1:
			System.out.println("one");
			break;
		case 3:		
			System.out.println("two");
			break;
		case 10:		
			System.out.println("two");
			break;
		default:
			System.out.println("two");

		}

	}
	
	
	public static void ddd() {
		
	}

}
