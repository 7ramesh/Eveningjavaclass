package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowExample {

	public static void main(String[] args) {
		ThrowExample obj = new ThrowExample();
		obj.method1();
		System.out.println("How are you");
		}
	public void method1() {
		try {
			method2();
		}
	
		catch(FileNotFoundException e){
			System.out.println("****FileNotFoundException is handled.****");
			e.printStackTrace();
					
		}
	}
	public void method2()throws FileNotFoundException{
		method3();
		
	}
	public void method3()throws FileNotFoundException{
		FileInputStream iso = new FileInputStream("c:\\temp.text");
	}
	

}
