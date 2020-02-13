package oops;

public class Employee {
	String name;
	int salary;
	int id;
	
	 void canWork() {
		System.out.println("He can Wrok");
	}
	void displayEmployeeDetails(Employee employee) {
		System.out.println("the name is:"+employee.name+"salary is :"+ employee.salary+
				"id is:"+ employee.id);
			
	}
	
	public static void main(String args[]) {
		Employee employee = new Employee();
		employee.canWork();
		employee.name = "Ramesh";
		employee.salary = 40000;
		employee.id = 420;
		employee.displayEmployeeDetails(employee);
		
		

	}

}
