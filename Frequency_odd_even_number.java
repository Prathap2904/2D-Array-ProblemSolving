package Array_matrix;

public class Frequency_odd_even_number {

	public static void main(String[] args) {
		int a[][] = {
				{4,1,3},
				{3,5,7},
				{8,2,6}
		};
		int evencount =0;
		int oddcount = 0;
		int row = a.length;
		int col = a[0].length;
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]%2==0) {
					evencount++;
				}
				if(a[i][j]%2 !=0) {
					oddcount++;
				}
			}
		}
		System.out.println("The Frequency of EvenNumber is :"+evencount);
		System.out.println("The Frequency of OddNumber is :"+oddcount);

	}

}
