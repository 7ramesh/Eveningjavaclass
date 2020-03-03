package stringManipulation;

public class StringManipulation {

	public static void main(String[] args) {
		char[]ch= {'g','a','b'};
		String s=new String(ch);
		System.out.println(s);
		String s1=new String("Ramesh");
		String s2="Hari";
		System.out.println(s2.charAt(1));
		System.out.println(s2.length());
		System.out.println(s1.replace("i","j"));
		System.out.println(s2.contains(s1));

	}

}