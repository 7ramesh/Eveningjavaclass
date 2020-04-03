package abst;

public class Bank1 {
	
	public static void main(String []args) {
	
	AustinTelco c = new AustinTelco();
		printBankInfo(c.getBankName(),c.getRate(),c.serviceChargeRate(),c.getDollarExchangeRate());
	
	Bank c1 = new Bank();
		printBankInfo(c1.getBankName(),c1.getRate(),c1.serviceChargeRate(),c1.getDollarExchangeRate());
	
	Wells w = new Wells();
		printBankInfo(w.getBankName(),w.getRate(),w.getDollarExchangeRate(),w.serviceChargeRate());
	
	City a = new City();
		printBankInfo(a.getBankName(),a.getRate(),a.getDollarExchangeRate(),a.serviceChargeRate());
	Capitol c3 = new Capitol();
		printBankInfo(c3.getBankName(),c3.getRate(),c3.getDollarExchangeRate(),c3.serviceChargeRate());
	}
	public static void printBankInfo(String BankName, int getRate, double serviceChargeRate,double dollarExchangeRate) {
		System.out.println("Bank name :" + BankName +"\tInterestRate:"+getRate+"\tService Exchange rate:\" +serviceChargeRate+"+"\t Exchange Rate:" + "+getDollarExchangeRate +" );
	}
}
