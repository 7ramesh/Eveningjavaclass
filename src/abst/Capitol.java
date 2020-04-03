package abst;

class Capitol extends City  {
	
	public  String getBankName() {
		return "Capitol Bank";
}
	protected  int getRate() {
		return 3;
}
	public double serviceChargeRate() {
		return 8;
	}
	
	protected double getDollarExchangeRate() {
		return 115.5;
		
	}
	

}
