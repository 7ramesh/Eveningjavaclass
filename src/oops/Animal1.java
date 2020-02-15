package oops;

public class Animal1 {
	String name;
	int year;
	String color;
	
	Animal1( String name,int year,String color){
		this.name = name;
		this.year =year;
		this.color=color;
	}
	Animal1(){
		
	}
	void display(Animal1 x){
		System.out.println("The animal name is:"+x.name+x.year+x.color);
				
	}
	public static void main(String[]args) {
		Animal1 animal = new Animal1();
		animal.name = "Elephant";
		animal.year = 2020;
		animal.color = "White";
		Animal1 animal1 = new Animal1("elephant",2020,"blue");
		animal1.display(animal);
	}
}
