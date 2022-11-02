package PracticeCode;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) 
	{
		System.out.println("Enter the  String is : "); 
		Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        String  reversedstr=" ";
for(int i=str.length()-1; i>=0; i--)
		{
	     reversedstr = reversedstr+str.charAt(i);
		}
System.out.println("Original String is : " +str);
System.out.println("Reversed String is : " +reversedstr);
}}

	