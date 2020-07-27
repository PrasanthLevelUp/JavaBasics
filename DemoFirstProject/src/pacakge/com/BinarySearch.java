package pacakge.com;

public class BinarySearch {

	public static void main(String[] args) {
	
		int[] num = {7,9,12,15,30,56};
		int tar = 12;
		int l =0;
		int r = num.length;
		
		while(l<=r) {
			int m= (l+r)/2;			
			if(tar<num[m]) {
				System.out.println("Target is less");
				r=m-1;
			}else if(tar>num[m]) {
				System.out.println("Target is high");
				l=m+1;
			}else {
				System.out.println("Finded");
				break;
			}
		}
		
	}

}
