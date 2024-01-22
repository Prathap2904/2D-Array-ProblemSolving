package Array_matrix;

public class Array_two_sub {

	public static void main(String[] args) {
		int a[][] = {
				{4, 5, 6},  
                {3, 4, 1},  
                {1, 2, 3}  
		};
		int b[][] = {
				 {2, 0, 3},  
                 {2, 3, 1},  
                 {1, 1, 1}  
		};
		
		int sub[][] = new int[3][3];
		
		System.out.println("The Subtracted Array is :");
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				sub[i][j]=a[i][j] - b[i][j];
				System.out.print(sub[i][j]+" ");
			}
			System.out.println(" ");
		}
		

	}

}
