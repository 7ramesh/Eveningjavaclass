package fileInputStream;
import java.io.FileInputStream;


public class FileInputStreamExample {

	public static void main(String[] args) {
		try {
			FileInputStream f =new FileInputStream("D:\\abc.txt");
			int i= 0;
			while((i=f.read())!=-1) {
				System.out.print((char)i);
			}
		}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}