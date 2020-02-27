package abst;

abstract class Wells extends Bank {
	@Override
	public String getBankName() {
		return "Wells";
	}
	@Override
	protected int getRate() {
		return 20;
		
	}

}
