package finalkeyword;

public class Car {
	final int speedlimit = 90;
	void run() {
		System.out.println("running");
	
	}
}
class honda extends Car{
	void run() {
		System.out.println("running safely");
	}
	public static void main(String []args) {
		Car obj=new Car();
		obj.run();
	}
}
