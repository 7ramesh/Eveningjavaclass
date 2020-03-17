package exception;

public class TrynCatch {

	public static void main(String[] args) {
		try {
			validatAage(18);
		}
		
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
			System.out.println("Congras");
		}
	public static void validatAage(int age) {
		if(age<18) {
			throw new ArithmeticException("age:"+age+"is not valid.");
			}else {
				System.out.println("You are eligible to vote");
			}
	}

}
