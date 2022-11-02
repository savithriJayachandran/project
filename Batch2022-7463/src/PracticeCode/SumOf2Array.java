package PracticeCode;

public class SumOf2Array {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,2},{4,6,3}};
		
		for(int i=0;i<arr[0].length;i++)
		{
			int sum =0;
			for(int j=0; j<arr.length; j++)
			{
				sum += arr[i][j];
			
			
			{
				System.out.print(arr[i][j]+ " ");
		}
			System.out.println("sum = " +sum);
		}
	}

	}
}

