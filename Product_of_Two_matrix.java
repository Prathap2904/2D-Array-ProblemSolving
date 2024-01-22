package Array_matrix;

public class Product_of_Two_matrix {

	public static void main(String[] args) {
		
		int a[][] = {{1,3,2},{3,1,1}, {1,2,2}};
		int b[][] = {{2,1,1},{1,0,1}, {1,3,1}};
		
		int row = a.length;
		int col = b[0].length;
		int c[][] = new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=0;
				for(int k=0;k<row;k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
