package inheritance;

public class Ramesh {
	float salary= 70000;
}
class Khadka extends Ramesh{
		int bonus = 40000;
		
public static void main(String []args) {
	Khadka R=new Khadka();
	System.out.println("Ramesh Salary is:"+R.salary+"Ramesh bonus is:"+R.bonus);
	}
}
