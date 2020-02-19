package override;

public class InterestRate {

	public static void main(String[] args) {
		Capitolone capital=new Capitolone();
		System.out.println("Capitol one:"+ capital.getRate());
		
		Bankofamerica america=new Bankofamerica();
		System.out.println("Bankofamerica Rate:"+america.getRate());
		
		Wellsfargo wells=new Wellsfargo();
		System.out.println("Wellsfargo Rate:"+wells.getRate());

	}

}
