package fileClass;
import java.io.IOException;
import java.io.File;
public class FileWriteOnly {
	public static void main(String args[])throws IOException {
		File myfile=new File("D:\\RKD.txt");
		if(myfile.canWrite()) {
			System.out.println("File is Writable");
		}
		else {
			System.out.println("File Read Only");
		}
	}

}
