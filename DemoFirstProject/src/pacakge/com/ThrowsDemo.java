package pacakge.com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		File file = new File("C:\\Users\\hi\\Documents\\Test.txt");
		BufferedReader buff = new BufferedReader(new FileReader(file));
		int line;
		String name = buff.readLine();
		System.out.println(name);
		String name1 = buff.readLine();
		System.out.println(name1 );
		while((line=buff.read())!=-1) {
			System.out.print((char)line);
		}
		
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));	
		writer.write("Niha");
		writer.newLine();
		writer.write("Piza");
		writer.newLine();
		writer.close();
	}

}
