package oops;

public class PassObjAsParam {
	public static void main(String[]args) {
		Student s1 = new Student(1, 50);
		Student s2 = new Student(1, 50);
		Student s3 = new Student(2, 20);
		
		System.out.println("object s1==s2:"+ s1.equals(s2));
		System.out.println("object s1 == s3:"+ s1.equals(s3));
		
	}
}
	class Student{
		private int id = 10;
		private int rollNo = 30;
	
	public Student(int id, int rollNo) {
		this.id = id;
		this.rollNo = rollNo;
	}
	
	boolean equals(Student a) {
		if (this.id == a.id && this.rollNo == a.rollNo) {
			return true;
		
	}
		return false;
	}
	
	
	
	
	}
