package runtimepolymorphism;

public class Harly extends Bike {
	@Override
	public void run(){
		System.out.println("Harly is running");
}
	public static void main(String []args) {
		Bike b= new Bike();
		b.run();
		Harly h=new Harly();
		h.run();
				
		
	}
}
