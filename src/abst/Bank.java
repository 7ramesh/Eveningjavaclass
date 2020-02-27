package abst;

abstract class Bank {
	public abstract String getBankName();
	
	protected abstract int getRate();
	
	public int serviceChangeRate = 4;
	
	protected double getDollarExchangeRate() {
		return 112.5;
	}
}
