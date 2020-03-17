package exception;
import java.io.FileInputStream;

public class CompileTimeException {

	public static void main(String[] args) {
		try {
		
		FileInputStream f= new FileInputStream("student.txt");
	} catch(Exception e) {
		System.out.println("We are reading exception handling");
	}
}
}