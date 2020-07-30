package pacakge.com;

public class RecursionDemo {

	static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionDemo ob = new RecursionDemo();
		ob.recurisve(4);
		System.out.println(count);
	}

	public void recurisve(int n) {
		{int i =0;
			if(n>0) {
				count++;
				System.out.println("Before1: " +n);
				--n;
				recurisve(n);
				System.out.println("nvalue1: "+n);
				i++;
				//System.out.println("After1: "+i);
				
				
				System.out.println("Before2: " +n);
				recurisve(n);
				System.out.println("nvalue2: "+n);
				i++;
				//System.out.println("After2: "+i);
			
			}
		}
		
	}
	}
