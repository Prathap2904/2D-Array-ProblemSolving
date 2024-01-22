package Array_matrix;

public class Transpose_matrix {

	public static void main(String[] args) {
		 int a[][] = {    
                 {1, 2, 3},    
                 {4, 5, 6},    
                 {7, 8, 9}    
              };    
		 int row = a.length;
		 int col = a[0].length;
		 int t[][] = new int[row][col];
		 
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 t[i][j] = a[j][i];
			 }
		 }
		 //System.out.println();
		 System.out.println("The Transpose Matrix is :");
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				System.out.print(t[i][j]+" ");
			 }
			 System.out.println(" ");
		 }
		 
		 
		 
		 
	}

}
