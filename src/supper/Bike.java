package supper;

public class Bike extends Bike1 {
	String name = "BMW";
	int model = 1960;
public void displaymodel() {
	System.out.println("Bike model is;"+name+model);
	System.out.println("Bike1 model is;"+name+super.model);
}
public static void main(String[]args) {
	Bike obj =new Bike();
	obj.displaymodel();
	
}
}
