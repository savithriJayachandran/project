package Throws;
import java.lang.*;
public class ThrowsExample {
	void method(int age)throws ArithmeticException{ 
		if(age<18)
		  throw new ArithmeticException ("Not eligible for Government exams");
		else {
			System.out.println("Eligible for government exams");
		}}
public static void main(String[] args) 
	{
	try
		{   ThrowsExample t=new  ThrowsExample();  
		     t.method(16);  
		    }
	catch(Exception e)
		{
		 System.out.println("Exception handled");
		 }     
		 System.out.println("The rest of the code ");  
		  } }  
      
