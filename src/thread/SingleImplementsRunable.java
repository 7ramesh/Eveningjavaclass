package thread;
import java.util.*;

public class SingleImplementsRunable  {
	public void run(){
		String st = "Ramesh";
		System.out.println(st);
	}



	public static void main(String[] args) {
		SingleImplementsRunable r= new SingleImplementsRunable();
		Thread t= new Thread("r");
		t.start();
		
		

	}

}
