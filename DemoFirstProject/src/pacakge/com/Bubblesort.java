package pacakge.com;

public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] number= {5,1,-2,4,6};

		for(int i:number) {
			System.out.print(i+" ");
		}
		
		
		int len = number.length;
		System.out.println();

		for(int i=0;i<len-1;i++) {

			System.out.println(i);

			for(int j =0;j<len-i-1;j++) {
				System.out.print(" "+j);
				if(number[j]>number[j+1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1]=temp;
				}
			}
		}
		System.out.println();
		for(int i:number) {
			System.out.print(i+" ");}
	}

}




