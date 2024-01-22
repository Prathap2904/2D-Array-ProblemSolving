package Array_matrix;

public class Two_matrix_equal {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{8,4,6},{4,5,7}};
		int b[][] = {{1,2,3},{8,4,6},{4,5,7}};
		boolean flag = true;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i][j] != b[i][j]) {
					flag = false;
				}
			}
		}
		if(flag) {
			System.out.println("Two matrix are equal ");
		}
		else {
			System.out.println("Two matrix are not equal");
		}

	}

}
