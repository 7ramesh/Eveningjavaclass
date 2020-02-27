package abst;

public abstract class AustinTelco extends Bank {
	@Override
	public String getBankName() {
			return "Austin Telco";
		}
		@Override
		protected int getRate() {
			return 6;
		}
			
}
