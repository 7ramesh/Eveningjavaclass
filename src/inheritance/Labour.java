package inheritance;

public class Labour {
	float labour= 50000;
	
}
class L extends Labour {
	int bonus = 20000;

public static void main(String []arg) {
	L LB = new L();
	System.out.println("Labour cost:"+LB.labour);
	System.out.println("Labour Bonus is:"+LB.bonus);
	}
}
