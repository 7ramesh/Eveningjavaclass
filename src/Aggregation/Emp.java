package Aggregation;

public class Emp{
	int id;
	String name;
	Address address;
public Emp(int id, String name, Address address) {
	this.id = id;
	this.name = name;
	this.address=address;
}
void display() {
	System.out.println(id + "" + name);
	System.out.println(address.city + "" +address.state+ "" +address.country);
	}
public static void main(String []args) {
	Address address1= new Address("Pflugerville", "Texas", "USA" );
	Address address2= new Address("Austin", "Tx", "Travis");
	
	Emp e1 = new Emp(12, "Ramesh", address1);
	Emp e2 = new Emp (5,"Khadka", address2);
	
	e1.display();
	e2.display();
	}
}



