package clasarray;

public class GreatestExample {

	public static void main(String[] args) {
		int a[]={20,50,8,60,4,10,5,9,};
		int greatest = a[0];
		for (int i=0; i<a.length;i++)
			if (a[i]>greatest)
					greatest = a[i];
		
		System.out.println("Smallestt Numbers array is:"+greatest);

	}

}
