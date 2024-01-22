package Array_matrix;

public class Upper_triangular_matrix {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{8,6,4},{4,5,6}};
		
		int row = a.length;
		int col = a[0].length;
		
		if(row != col) {
			System.out.println("Given matrix is not a square matrix");
		}
		else {
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					if(i>j) {
						System.out.print("0"+" ");
					}
					else {
						System.out.print(a[i][j]+" ");
					}
				}
				System.out.println(" ");
			}
		}

	}

}
