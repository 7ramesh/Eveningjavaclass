package overloading;

public class ClassB { // Contractor overloading method
	ClassB(){
		System.out.println("Contractor");
	}
	ClassB(int B){
		System.out.println("ClassB="+B);
		
	}
	public static void main(String []args) {
		ClassB obj = new ClassB();
		ClassB obj1 = new ClassB(40); // 40 Parameter
		
	}
	
	
	
}
// Overloading method, same name, same class, different arguments (no of arguments,sequence of arguments or type of arguments)