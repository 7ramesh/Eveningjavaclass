package override;

public class Bankofamerica extends Bank {
	@Override
	protected int getRate() {
		return 10;
}
}