package Thread;
import java.util.Scanner;
class Details implements Runnable{
	static String name;
	static int age;
public void run(){
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the name : " );
		name=c.next();
		System.out.println("The name is : "+name );
		Scanner c1=new Scanner(System.in);
		System.out.println("Enter the Age: " );
		age=c1.nextInt();
		System.out.println( "The Age is : "+age );
}}
class printing  implements Runnable{
	public void run(){
	System.out.println( "The name of person is : " + Details.name +" and the age of person is: "+Details.age );
		}}

public class MultiThread {
	public static void main(String[] args) {
		Runnable r=new Details();
		Runnable rr=new printing();
		
		Thread t=new Thread(r);
		Thread tt=new Thread(rr);
		
		t.start();
	try {
			Thread.sleep(10000);
			tt.start();
		    }
		catch(Exception e){
			System.out.println(e);
		}


	}}
