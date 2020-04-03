package homework;

public class GetternSetter {
		String name;
		int age;
		
		public static void main(String[] args) {
			GetternSetter GS = new GetternSetter ();
			GS.sayHappyBirthday("Ramesh");
	}
		public static void sayHappyBirthday(String name) {
			System.out.println("Happy Birth Day:"+name);
		}

}
