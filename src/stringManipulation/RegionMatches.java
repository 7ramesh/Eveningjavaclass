package stringManipulation;

public class RegionMatches {

	public static void main(String[] args) {
		String str1 = "The Ramesh Khadka from Nepal";
		String str2 = "I am working in USA";
		boolean match1 = str1.regionMatches(0, str2, 10, 5);
		boolean match2 = str2.regionMatches(0, str1, 6, 9);
		System.out.println();
		
	System.out.println("str1[0-9]==str2[6-9]?"+match1);
	System.out.println("str1[9-15}==str2[9-15]?"+match2);

	}

}
