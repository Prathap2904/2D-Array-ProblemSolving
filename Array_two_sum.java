package Array_matrix;

public class Array_two_sum {

	public static void main(String[] args) {
		int a[][] = {
				 {4, 5, 6},  
                 {3, 4, 1},  
                 {1, 2, 3}
		};
		int b[][] = {
				 {4, 5, 6},  
                 {3, 4, 1},  
                 {1, 2, 3}
		};
		int sum[][] = new int[3][3];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				 sum[i][j] = a[i][j]+b[i][j];
				 System.out.print(sum[i][j]+" ");
			}
			System.out.println(" ");
		}

	}

}
