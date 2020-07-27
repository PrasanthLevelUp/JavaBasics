package pacakge.com;

public class LinearSearchDemo {

	public static void main(String[] args) {
		int[] num = {5,7,8,2,45, 7,8};
		int findnumber = 7;
		
		for(int n :num) {	
			if(n==findnumber) {
				System.out.println("Finded the number ");
				break;
			}
		}		
	}

}
