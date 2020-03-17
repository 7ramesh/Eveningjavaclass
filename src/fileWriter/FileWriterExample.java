package fileWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileWriterExample {

	public static void main(String[] args) {
		try {
			FileWriter fileWriter=new FileWriter("D:\\pbc.txt");
			fileWriter.write("this is class of file wirter");
			fileWriter.write('a');
			fileWriter.close();
			System.out.println("competed");
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
