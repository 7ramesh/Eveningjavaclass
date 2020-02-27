package abst;

public class AbstractClassTest {

	public static void main(String []args) {
	
	Bank c = new Bank();
		printBankInfo(c.getBankName(),c.getRate(),c.getDollarExchangeRate(),c.serviceChangeRate);
	
	Bank c1 = new Capitol();
		printBankInfo(c.getBankName(),c1.getRate(),c1.getDollarExchangeRate(),c1.serviceChangeRate);
	
	Bank w = new Wells();
		printBankInfo(w.getBankName(),w.getRate(),w.getDollarExchangeRate(),w.serviceChangeRate);
	
	Bank a = new AustinTelco();
		printBankInfo(c.getBankName(),c.getRate(),c.getDollarExchangeRate(),c.serviceChangeRate);
	}
	public static void printBankInfo(String BankName, double rate, double dollarExchangeRate,int serviceChangeRate) {
		System.out.println("Bank name :" + BankName +"\tInterestRate:"+rate+"\tDollar Exchange Rate:" + dollarExchangeRate + 
				"\tService Exchange rate:" + serviceChargeRate );
	}
}
