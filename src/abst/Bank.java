package abst;

public class Bank extends AustinTelco{
	
	public  String getBankName() {
		return "Bank";
	}
	
	protected  int getRate() {
		return 5;
	}
	
	public double serviceChargeRate() {
		return 40;
	}
	
	protected double getDollarExchangeRate() {
		return 111.5;
	}
}
