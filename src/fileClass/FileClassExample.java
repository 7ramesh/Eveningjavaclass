package fileClass;

import java.io.File;
import java.io.IOException;
public class FileClassExample {

	public static void main(String[] args) {
		try {
			File file = new File("d:\\rk.txt");
			boolean b=file.createNewFile();
			if(b) {
				System.out.println("File has been  creted successfully");
			}
			else {
				System.out.println("File already present at the specified location");
			}
		}catch(IOException e) {
			System.out.println("exception occurred");
			e.printStackTrace();
		}
		
	}
}
		
		
				

	


