package fileClass;
import java.io.IOException;
import java.io.File;
public class SetWritableTrue {

	public static void main(String[] args) {
		File myfile=new File("D:\\R");
		myfile.setWritable(true);
		if(myfile.canWrite()) 
		{
			System.out.println("File is Writable");
		}
		else {
			System.out.println("File can onlyReadable");
		}

	}

}
