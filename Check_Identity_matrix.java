package Array_matrix;

public class Check_Identity_matrix {

	public static void main(String[] args) {
		 int a[][] = {       
                 {1, 0, 0},    
                 {0, 1, 0},    
                 {0, 0, 1}    
             };    
		 boolean flag = true;
		 int row = a.length;
		 int col = a[0].length;
		 
		 for(int i=0;i<row;i++) {
			 for(int j=0;j<col;j++) {
				 if(i==j && a[i][j]!=1) {
					 flag=false;
				 }
				 if(i!=j && a[i][j]!=0) {
					 flag=false;
				 }
			 }
		 }
		 if(flag) {
			 System.out.println("The given matrix is Identity matrix ");
		 }
		 else {
			 System.out.println("The given matrix is not a Identity matrix ");
		 }
     

	}

}
