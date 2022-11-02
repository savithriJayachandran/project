package PracticeCode;

public class Swapping1 
{

	public static void main(String[] args) 
	{
		int a=7;
		int b=3;
		System.out.println("before swapping");
		System.out.println("First number "+a);
		System.out.println("second number "+b);
		
		 a=a+b;
		b=a-b;
		a=b-a;
		
		System.out.println("After swapping");
		System.out.println("First number "+a);
		System.out.println("second number "+b);
		

	}

}
