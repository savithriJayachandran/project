package Thread;
import java.util.Scanner;
public class ThreadExample implements Runnable  {
public void run(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=sc.nextInt();
    int fact=1;
    for(int i=1; i<=num; i++)
    {
    	fact=fact*i;
    }
   System.out.println(" The  factorial of number is :" +fact);
	{
	int a,res=0,n;
	Scanner c =new Scanner(System.in);
	System.out.println("Enter a number : ");
	n=sc.nextInt();
	while(n!=0)
	{
		a=n%10;
		res=(res*10)+a;
		n=n/10;
	}
	System.out.println("Reverse of the number:" +res);
}
	 {
			System.out.println(Thread.currentThread());
		}}
public static void main(String[] args) 
{
    System.out.println(" Main thread :" );
	ThreadExample te=new ThreadExample();
	Thread t= new Thread(te);
	t.start();
	System.out.println(" The  new thread is:" +t.getName());
	t.setName("Thread new");
	}}
