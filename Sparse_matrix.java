package Array_matrix;

public class Sparse_matrix {

	public static void main(String[] args) {
		int a[][] = {       
                {4, 0, 0},    
                {0, 5, 0},    
                {0, 0, 6}    
            };    
		int row = a.length;
		int col = a[0].length;
		int zerocount = 0;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]==0) {
					zerocount++;
				}
			}
		}
		int size = row * col - zerocount;
		
		if(zerocount>size) {
			System.out.println("It is a Sparse Matrix");
		}
		else {
			System.out.println("It is not a Sparse matrix");
		}

	}

}
