package genericMethod;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class CompileException {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("c:\\temp.text");
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("continue other operation here.");
	}

}
