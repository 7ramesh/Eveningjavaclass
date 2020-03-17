package exception;

public class TrynCatch1 {

	public static void main(String[] args) {
		try {
			validateAge(22);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("you approve");

	}
	
	private static void validateAge(int age) {
		if(age <21 ) {
			throw new ArithmeticException("Age:" + age +" is not valid");
		}else {
			System.out.println("You can buy alcohol");
		}
		
	}

}
