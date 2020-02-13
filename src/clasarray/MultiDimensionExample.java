package clasarray;

public class MultiDimensionExample {

	public static void main(String[] args) {
		int[][]matrix=new int[3][3];
		matrix[0][0]=1;
		matrix[0][1]=2;
		matrix[0][2]=3;
		matrix[1][0]=4;
		matrix[1][1]=5;
		matrix[1][2]=6;
		matrix[2][0]=7;
		matrix[2][1]=8;
		matrix[2][1]=9;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(matrix[i][j]);
			}
		}
		
		int[][]mat=new int[4][4];
		mat[0][0]= 50;
		mat[0][1]= 60;
		mat[0][2]= 70;
		mat[0][3]= 80;
		mat[1][0]= 90;
		mat[1][1]= 40;
		mat[1][2]= 50;
		mat[1][3]= 30;
		mat[2][0]= 60;
		mat[2][1]= 90;
		mat[2][1]= 70;
		for(int i=0; i<4;i++) {
			for (int j=0;j<4;j++) {
				System.out.println(mat[i][j]);
			}
		}
		int[][]math=new int[4][3];
		math[5][5]=20;
		math[0][5]=30;
		math[4][5]=40;
		math[8][0]=50;
		math[5][1]=60;
		math[1][2]=70;
		math[5][4]=80;
		math[9][5]=90;
		math[5][6]=10;
		math[2][8]=20;
		math[6][9]=20;
		math[9][9]=20;
		for (int i= 0; i<4;i++) {
			for(int j=0; j<3; j++) {
				System.out.println(math[i][j]);
			}
		}
		
		
		
	}

}
