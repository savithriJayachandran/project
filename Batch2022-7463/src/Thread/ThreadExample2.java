package Thread;
import java.util.Scanner;
public class ThreadExample2 extends Thread{ 
	public void run(){
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
			System.out.println("\n This is a prime number ");
		else
			System.out.println("\n This is not a prime number ");
		}
	{
		
		System.out.println("About the prime number");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" It works");

		ThreadExample2 te2=new ThreadExample2();
	
	Thread t=new Thread( te2);
	t.start();
	}

}
