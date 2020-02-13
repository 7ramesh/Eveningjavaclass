package conditional;

public class BreakLoop {

	public static void main(String[] args) {
		
		for(int i = 9; i>=0; i--) {
			for(int k = i; k>=0; k--) {
				if(k == 7) {
					break;
				}
				System.out.print(k + "");
			}
				System.out.println(i);
	}
	}
	}


