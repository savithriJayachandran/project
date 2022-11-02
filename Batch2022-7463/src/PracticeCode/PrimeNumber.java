package PracticeCode;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int num , i, count =0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		for(i=2;i<num; i++)
		{
			if(num%i ==0)
			{
				count++;
				break;
				}
			 
			}
		if(count ==0)
			System.out.println("\n +num+ This is a prime number ");
		else
			System.out.println("\n +num+ This is not a prime number ");
		}
	}
