package inheritance;

public class AA {
	int  a=40;
	void showAA() {
		System.out.println("a multiplelevel");
	}
}
class ram extends AA{
	int b = 50;
	void disram() {
		System.out.println("b multiplelevel");
	}
}

class cat extends AA{
	int c = 70;
	void displaycat() {
		System.out.println("c multiplelevel");
	}

public static void main(String []args) {
	cat a2= new cat();
	a2.displaycat();
	a2.showAA();
	
	ram r=new ram();
	r.disram();
	r.showAA();
}
}
