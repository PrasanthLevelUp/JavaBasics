package pacakge.com;

final class ThrowDemo {

	final static int i=5;
	
	final static void main(String[] args){
		
		int age =0;
	
		if(age>0) {
			System.out.println("Pass");
		
		}else {
			throw new IllegalArgumentException("Age is very less");
		}
	}
}
