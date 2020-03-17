package exception;

public class TestMultiple {

	public static void main(String[] args) {
		try {
		int a []=new int[5];
		a[5]=30/0;
		}
		catch(Exception e){
			System.out.println("task completed");
		}
		catch(ArithmeticException e){
			System.out.println("task is ready");
			
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("task 2");
	}
	
	System.out.println("rest of");
	}
}

