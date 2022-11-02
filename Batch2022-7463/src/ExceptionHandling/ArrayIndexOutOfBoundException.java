package ExceptionHandling;

public class ArrayIndexOutOfBoundException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
int arr[][]= {{4,5,6,7},{3,4,5,6}};
		
		System.out.println(arr[0][1]);
		}
	catch(Exception e)
	{
		
		System.out.println("It exceeds the array limit");
		System.out.println(e);
	}
}
}
