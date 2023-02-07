package Javaconcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileInput {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file= new File("/Users/riteshrikky/Desktop/Hello.txt");
		
		Scanner sc = new Scanner(file);
		
		
		
		while(sc.hasNextLine()) {
			String data =sc.nextLine();
			
			System.out.println(data);
		}
		
	}

}
