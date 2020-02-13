package oops;

public class ConstructorExample { // Constructor Method
		String name;
		int roll;
		static String schoolName="abc";
		
		ConstructorExample(String n,int r){
			name = n;
			roll = r;
				
		}
		public static void main(String[]args) {
			ConstructorExample s1=new ConstructorExample("Ramesh",1);
			System.out.println(("name is"+s1.name+"\n roll is"+s1.roll+"\n School name is"+s1.schoolName));
		}
}

