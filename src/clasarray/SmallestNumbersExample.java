package clasarray;

public class SmallestNumbersExample {

	public static void main(String[] args) {
		int numbers[]={20,50,8,60,4,10,5,9,};
		int smallest = numbers[0];
		for (int i=0; i<numbers.length;i++)
			if (numbers[i]<smallest)
					smallest = numbers[i];
		
		System.out.println("Smallestt Numbers array is:"+smallest);

	}
}



		




