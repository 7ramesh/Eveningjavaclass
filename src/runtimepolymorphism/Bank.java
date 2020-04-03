package runtimepolymorphism;

public class Bank extends Banka {
	

public static void main(String []args){ 
	Banka a = new Banka();
	
	//banka
	System.out.println("Bank of America Interest is:"+a.GetReateOfInterest());
	//bankb
	System.out.println("Wells Fargo Interest Rate is:"+a.GetRateOfInterest());
	System.out.println("City Bank Interest Rate is : "+a.equals(null));
	
	}
}
	
		
	


