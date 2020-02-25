package oops;

public class Bus {
			String modelname;
			int modelyear;
	public Bus(String name, int year) {
			modelname = "crv";
			modelyear = year;
		}
	public static void main(String []args) {
			Bus bus1 = new Bus("crv",2020);
				System.out.println("My Bus name is:"+bus1.modelname+" "+ bus1.modelyear);
			
			
	}
		
	}
	



  