package oops;

public class Car {
	String BrandCar;
	int modelYear;
	String Color;
	
	Car(String BMW, int year, String color){
		 BrandCar="MBW";
		modelYear=year;
		Color = "Blue";
	}
		public static void main(String[]args) {
			Car car1 = new Car("BMW",2020,"blue");
			System.out.println("Car name is:"+car1.BrandCar+"Color is:" + car1.color);
			
			System.out.println("Car Color is:"+car1.Color);
			
	}
	
}
