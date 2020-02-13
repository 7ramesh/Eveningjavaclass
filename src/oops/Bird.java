package oops;

public class Bird {
		String name;
		int age;
		String color;
		Bird(String n, int a,String c){
			name=n;
			age=4;
			color=c;
		
	}
		Bird(){
			
		}
		 void display(Bird a) {
			 System.out.println("The bird name is:"+a.name+"age is:"+a.age+"color is:"+a.color);
			 
		}
		 public static void main(String[]args) {
			 Bird bird = new Bird();
			 bird.name = "Dove";
			 bird.age = 2;
			 bird.color="blue";
			 
	}
}
