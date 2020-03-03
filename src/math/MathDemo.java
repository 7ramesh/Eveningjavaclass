package math;

import java.util.Locale;

	class MathDemo {
	public static void main(String[] args) {
		
		double d = 123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
		
		System.out.println("ITALY representation of " + d + " : "+ nf.format(d));
	}
}