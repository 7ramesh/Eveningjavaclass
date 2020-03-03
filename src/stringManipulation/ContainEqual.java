package stringManipulation;

public class ContainEqual {

	public static void main(String[] args) {
		String St= "Ramesh";
		System.out.println(St.contentEquals("RA"));
		System.out.println(St.contentEquals("Ramesh"));
		System.out.println(St.contentEquals("esh"));

	}

}
