package abst;

public class AustinTelco extends Bank1{
	public  String getBankName() {
	return "Austin Telco";
	}
	
	protected  int getRate() {
	return 9;
	}
	
	public double serviceChargeRate() {
		return 41;
	}
	
	protected double getDollarExchangeRate() {
		return 113.5;
		}
			
}
