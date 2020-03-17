package fileOutputStreamExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class FileOutputStreamExample {

	public static void main(String[] args) {
		try {
			FileOutputStream f = new FileOutputStream("D:\\abc.txt");
			String s= "this is java class of file io";
			byte[]b =s.getBytes();
			f.write(b);
			f.close();
			System.out.println("task complated");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e1) {
			e1.printStackTrace();
		}
		

	}

}
