package ExceptionHandling;

import java.lang.*;
public class MultipleCatchBlock {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		int[] a=new int[6];
		a[5]=0/3;
		System.out.println(" print the array element");
		}
        catch(ArithmeticException e){
		System.out.println("Arithmetic Exception ocurrs" +e);
		}
		catch(ArrayIndexOutOfBoundsException e){
		System.out.println("ArrayIndex Out Of Bound Exception" +e);
		}
		catch(Exception e)
		{
			System.out.println("Class Not Found Exception occurs" +e);
		}
	System.out.println("The rest of the code");
	}}
