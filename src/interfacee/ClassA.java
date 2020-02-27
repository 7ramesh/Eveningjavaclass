package interfacee;

public class ClassA {
	interface Printable{
		void print();
	}
	public class Printableimpl implements Printable{
		public void print() {
			System.out.println("Hello");
						
	}
	public static void main(String []args) {
		Printableimpl obj = new Printableimpl();
		obj.print();
		
	}
}
