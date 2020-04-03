package collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[]args) {
		List<Student> studentlist = new ArrayList<>();
		Student s1=new Student("Ram",1);
		Student s2=new Student("Rame",2);
		Student s3=new Student("Rames",3);
		Student s4=new Student("Ramesh",4);
		Student s5=new Student("RK",5);
		Student s6=new Student("RBK",6);
		studentlist.add(s1);
		studentlist.add(s2);
		studentlist.add(s3);
		studentlist.add(s4);
		studentlist.add(s5);
		studentlist.add(s6);
		studentlist.add(new Student("RK",102));
		
		List<Student>newList=new ArrayList<>();
		if(!newList.isEmpty()) {
			newList.remove(1);
		}
		//studentList.forEach(s->)//lamba expression in java 8
			
	
		//for(int i=0;i<studentList.size();i++) {
			//System.out.println(studnetList.get(i));
		
		//newList.addall(Studentlist);
		
		System.out.println(studentlist.isEmpty());
		if(!studentlist.isEmpty()) {
			for(Student s: studentlist) {
				System.out.println(s.toString());
			}
		}
		else System.out.println("list is empty");
		}

}
