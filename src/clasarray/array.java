package clasarray;

public class array {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
		int [] roll=new int[3];
		roll[0] = 5;
		roll [1] = 6;
		roll [2] = 54;
		for (int i=0;i<roll.length;i++) {
			System.out.println(roll[i]);
		}
		int[] grades=new int[4];
		grades [0]=10;
		grades [1]=20;
		grades [2]=30;
		grades [3]=40;
		for (int i=0; i<grades.length;i++) {
		System.out.println(grades[i]);
		
		}
		int [][]matrix={{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(matrix [i][j]);
			}
		}
		
		}
	}
	

