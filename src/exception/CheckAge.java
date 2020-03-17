package exception;

public class CheckAge {
	static void checkAge(int age) {
		
	// Throw an exception if age is below 18 (print "Access denied"). If age is 18 or older, print "Access granted":
		if(age < 18) {
			throw new ArithmeticException("Access denied-You must be 18 years old");
			}else {
				System.out.println("Access denied- you are old enough");
			}
			
		}
	public static void main(String[] args) {
		checkAge(16);
	}
}
