package Array_matrix;

public class Sum_of_each_row_column {

	public static void main(String[] args) {
		
		int a[][] = {{1, 2, 3},
					 {4, 5, 6}, 
					 {7, 8, 9}};
		
		int row = a.length;
		int col = a[0].length;
		
	
		
		
		for(int i=0;i<row;i++) {
			int rowsum =0;
			for(int j=0;j<col;j++) {
				rowsum += a[i][j];
			}
			System.out.println("The sum of " + (i+1)+"row is : " +rowsum);
			
		}
		for(int i=0;i<row;i++) {
			int colsum =0;
			for(int j=0;j<col;j++) {
				colsum += a[j][i];
			}
			System.out.println("The sum of " + (i+1)+"column is : " +colsum);
			
		}
	}

}
