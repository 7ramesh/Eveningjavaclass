package math;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

	class MathDemo {
	public static void main(String[] args) {
		
//		Double currencyAmount=new Double(1232345678.789);
//		Locale currentLocale=Locale.getDefault();
//		Currency currentCurrency = Currency.getInstance(currentLocale);
//		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(currentLocale);
//				
//			System.out.println(currentLocale.getDisplayName());
//			System.out.println(currentCurrency.getDisplayName());
//			System.out.println(currencyFormat.format(currencyAmount));
//		
//	}



		
		Double currencyAmount=new Double(12323.789);
		Locale currentLocale=Locale.FRANCE;
		Currency currentCurrency = Currency.getInstance(currentLocale);
		NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(currentLocale);
				
			System.out.println(currentLocale.getDisplayName());
			System.out.println(currentCurrency.getDisplayName());
			System.out.println(currencyFormat.format(currencyAmount));
	
		}
	}
