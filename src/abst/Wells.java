package abst;

 class Wells extends Bank {
	
public  String getBankName() {
	return  "Wells Fargo";
	}
	protected  int getRate() {
		return 7;
	}
	
	public double serviceChargeRate() {
		return 45;
	}
	
	protected double getDollarExchangeRate() {
		return 119.5;
	}

}
