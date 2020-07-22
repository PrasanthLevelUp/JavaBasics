package pacakge.com;

public class OneDimensinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//intialization of array
		int[] a = new int[10];
		int[] b = new int[]{7,9,9};	
		int length  = a.length;
		
	//value storing of arrary	
		a[0]=10;
		a[1]=14;
		
		String[] str = new String[4];	
		str[0] = "one";
		str[1] = "one";
		str[2] = "one";
		str[3] = "one";
		
	//enhanced for loop only for array	
		for(int i:a) {		
			System.out.println(i);	
		}
		
		

		int nuofrow = 2;
		int nofcol = 3;
		
int[][] arr= new int[nuofrow][nofcol];

int[][] arr2 = {{3,5,5,5},{5,7,8},{4,6,7}};


int leng = arr.length;
int firstrowlenght = arr2[0].length;
int firstrowlenght2 = arr2[1].length;
System.out.println(firstrowlenght);

System.out.println(firstrowlenght2);
System.out.println(leng);
	
		arr[0][0]=10;
		arr[0][1]=13;
		arr[0][2]=13;
		arr[1][0]=13;
		arr[1][1]=13;
		arr[1][2]=13;
		
		for(int i =0;i<nuofrow;i++) {
	
			for(int j=0;j<nofcol;j++) {
					
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
			
		}
		
		for (int i=0; i<5; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        { 
            System.out.print(" "); //print space
        
        for (int j=0; j<=i; j++ ) //inner loop for number of columns
        { 
            System.out.print("* "); //print star
        } 
        System.out.println();
        }
	
	/*
	*
	**
	***
	****
	******/

	for(int row=5;row>=1;row--) {
		
		
		for(int col =1;col<=row;col++) {
			//System.out.print(col);
		}
		
		System.out.println();
	}
	
	}
	
}
