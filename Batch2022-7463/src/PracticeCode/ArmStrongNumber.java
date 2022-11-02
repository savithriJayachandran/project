package PracticeCode;
import java.util.Scanner;
public class ArmStrongNumber {
Scanner c=new Scanner(System.in);
public void armStrongNumber(int n)
{
	int num=n;
	if(n>0) {
		int rem=0,checknum=0;
		while(n!=0) {
			rem=n%10;
			checknum+=(rem*rem*rem);
			n/=10;
		}
		if(num==checknum)
	System.out.println("The number is Armstrong number"+ checknum);
		else
			System.out.println("The number is :" +num+  "  and cube of digit sum is: "+ checknum+ " then not an Armstrong Number ");
	}
	else
		System.out.println("give only positive number ");
	armStrongNumber(c.nextInt());
	}
public static void main(String[] args) {
	Scanner c=new Scanner(System.in);
	ArmStrongNumber A=new ArmStrongNumber();
	System.out.println("Enter the positive number ");
	int n=c.nextInt();
	A.armStrongNumber(n);
	c.close();
}}
