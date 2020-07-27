package pacakge.com;

public class Selectsort {

	public static void main(String[] args) {
	
		int[] number= {5,1,-2,4,6};
		
		for(int i:number) {
			System.out.print(i+" ");
		}	
		
		int len = number.length;
		System.out.println();

		for(int i=0;i<len-1;i++) {
			int min = i;
			//System.out.println(i);

			for(int j =i+1;j<len;j++) {
				//System.out.print(" "+j);
				if(number[j]<number[min]) {
					min=j;
				}		
			}
			
			int temp = number[min];
			number[min] = number[i];
			number[i]=temp;
			for(int k:number) {
				System.out.print(k+" ");}
		}
		System.out.println();
		for(int i:number) {
			System.out.print(i+" ");}
	}

	}


