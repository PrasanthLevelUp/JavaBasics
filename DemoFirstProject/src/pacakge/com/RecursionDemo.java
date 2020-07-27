package pacakge.com;

public class RecursionDemo {

	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionDemo ob = new RecursionDemo();
		ob.recurisve(3);
		System.out.println(count);
	}
	
	public void recurisve(int n) {
		{
			if(n>0) {
				count++;
				System.out.println("Before" +n);
				recurisve(n);
				System.out.println("After"+n);
				recurisve(n);
				
			}
		}
		
	}
	

}
