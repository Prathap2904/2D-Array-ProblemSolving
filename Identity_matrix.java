package Array_matrix;

public class Identity_matrix {

	public static void main(String[] args) {
		int a[][] = {
				 {1, 0, 0},    
                 {0, 1, 0},    
                 {0, 0, 1}  
		};
		
		int row = a.length;
		int col = a[0].length;
		
		boolean flag = true;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(i==j && a[i][j] != 1) {
					flag = false;
				}
				if(i!=j && a[i][j]!=0) {
					flag = false;
				}
			}
		}
		if(flag) {
			System.out.println("it is a Identity matrix");
			
		}
		else {
			System.out.println("It is Not a Identity matrix ");
		}
		

	}

}
