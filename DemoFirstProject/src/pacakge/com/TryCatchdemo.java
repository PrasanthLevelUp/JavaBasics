package pacakge.com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchdemo {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\hi\\Documents\\Test.txt");
		BufferedReader buff;
		try {
			buff = new BufferedReader(new FileReader(file));
			int line;
			String name="";
			try {
				name = buff.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name);
			String name1="";
			try {
				name1 = buff.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name1);
			
			try {
				while ((line = buff.read()) != -1) {
					System.out.print((char) line);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.fillInStackTrace();
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		}catch (Exception e) {
			e.fillInStackTrace();
			System.out.println("FileNotFoundException");
			e.printStackTrace();
		}
		finally {
			System.out.println("finalyy");
		}

	}

}
