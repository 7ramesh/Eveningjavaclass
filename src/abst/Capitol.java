package abst;

abstract class Capitol extends Bank {
	@Override
	public String getBankName() {
		return "Capitol";
	}
	@Override
	protected int getRate() {
		return 6;
		
	}
	

}
