
public class percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int english = 81, math = 50, social = 91, science = 71;
		int sumtotal=english+math+social+science;
		float percentage=(float)(sumtotal)/4;
		System.out.println(percentage);
		if(percentage >=90){
		System.out.println("distinction");
		}
		else if (percentage >=80){
			System.out.println("1st");}
		else if (percentage >=70){
			System.out.println("2nd");}
		else {
			System.out.println("fail");}
				
				
				
		
	}

}
