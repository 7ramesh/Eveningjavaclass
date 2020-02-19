package override;

public class Wellsfargo extends Bank {
	@Override
	protected int getRate() {
		return 4;
}
}