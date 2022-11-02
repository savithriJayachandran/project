package PracticeCode;

public class SumOfarrayRow {

	public static void main(String[] args) {
	

		int arr[][]= {{1,2,3},{4,5,2},{4,6,3}};
		
		for(int i=0;i<arr[0].length;i++)
		{
			int sum=0;
			for(int j=0; j<arr.length; j++)
			{
				sum += arr[i][j];
				
				System.out.print(arr[i][j]+ " ");
		}
			System.out.println( "The Sum Array by Rowwise: "  +sum);
		}
	}

}

