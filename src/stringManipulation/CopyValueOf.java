package stringManipulation;

public class CopyValueOf {

	public static void main(String[] args) {
		char[] st= {'a','b','c','d','e'};
		String s="";
		s = s.copyValueOf(st, 0, 3);
		System.out.println("Return String:"+s);

	}

}
