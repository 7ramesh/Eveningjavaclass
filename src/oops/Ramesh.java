package oops;
//Running Objects
public class Ramesh {
	int a;
	Ramesh(int i){
		a = i;
	}
	Ramesh incrByTen() {
		Ramesh Temp = new Ramesh(a + 10);
		return Temp;
	}
}
	class RetOb{
	public static void main(String[] args) {
		Ramesh c1 = new Ramesh(2);
		Ramesh c2;
		c2=c1.incrByTen();
		System.out.println("c1.a:" + c1.a);
		System.out.println("c2.a:" +c2.a);
		c2=c2.incrByTen();
		System.out.println("c2.a after second increase:" + c2.a);
		
		
		}
}
