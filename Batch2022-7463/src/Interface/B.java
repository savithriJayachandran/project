package Interface;

import java.util.Scanner;

interface Amount
   {
	
void amount();

    }
class B implements Amount
	{
	int amt;
	public void amount() 
	{ 
	Scanner SC = new Scanner(System.in);
	System.out.println("Enter the amount: ");
    amt=SC.nextInt();
    System.out.println(" The amount is: "+amt);
	}
public static void main(String[] args) {
	 Amount obj=new B();
     obj.amount();
    }}



