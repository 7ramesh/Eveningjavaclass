package homework;

public class StringPalindrome {

	public static void main(String[] args) { // "Ramesh" lenght() = 6
		String name = "Ramesh";				//charAt(4)s
		int lang = name.length();
		String rev = "";
		for(int i=lang-1; i>=0; i--) {
			rev=rev+name.charAt(i);
			System.out.println(rev);
			
		}
		
				

	}

}

