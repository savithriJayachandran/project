package FinalKeyword;
import java.util.Scanner;

public class FinalExample {
final String n="Hello everyone!";
String s;
Scanner sc=new Scanner(System.in);
void display ()
{
    System.out.println("Enter the Name: " );
	String s =sc.nextLine();
	
	System.out.println(n+  " Welcome to the wonderful session " +s );
}
public static void main(String[] args) {

FinalExample fe=new FinalExample();
fe.display();

	}

}
