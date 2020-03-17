package fileReader;
import java.io.FileNotFoundException;
public class FileReader {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("D:\\pbc.txt");
			int i=0;
			while((i=fileReader.read())!=-1{
				System.out.println((char)i);
			}
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
