package abst;

abstract class City extends Bank {
	@Override 
	public String getBankName() {
		return "City";
	}
	@Override
	protected int getRate() {
		return 10;
		
}
}