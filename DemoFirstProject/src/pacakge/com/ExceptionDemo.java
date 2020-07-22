package pacakge.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionDemo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		//try-catch
		//throws
		//throw
		
		ExceptionDemo obj  = new ExceptionDemo();
		obj.siub();
		try {
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		 

	}
	
	public void siub() throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\hi\\Desktop\\EclipseJavaShorcut.txt"));
	}

}
