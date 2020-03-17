package genericMethod;

public class Generic {
	public static void main(String args[]) {
	Integer[] iaray = {1,2,3,4,4,5,6,7,8};
	Character [] caray = {'a','b','c','d','e'};
	
		printMe(iaray);
		printMe(caray);
}
	//Generic Method
	public static <T> void printMe(T[]x) {
		for(T R :x)
			System.out.printf(" %s",R);
		System.out.println();
	}
}
