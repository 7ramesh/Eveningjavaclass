package fileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.File;
public class FileReader {

	public static void main(String[] args) throws IOException{
		File myfile = new File("D:\\RK.txt");
		boolean flag=myfile.setReadOnly();
		if(flag==true)
	{
			System.out.println("File convered to read only mode");
	}
		else {
			System.out.println("Unsuccess operation!!");
		}
	
	}
}

