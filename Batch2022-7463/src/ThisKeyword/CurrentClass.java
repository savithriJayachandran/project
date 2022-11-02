package ThisKeyword;

public class CurrentClass {
int a=8;
int b=7;
CurrentClass()
    
{
	System.out.println("The addition of a and b is :" +(a+b) );
	}
CurrentClass(int a,int b){
	this();
	a++;
	b++;
	System.out.println(  "Increment of a and b is: " +a+" " +b);
    }
public static void main(String[] args) {
CurrentClass c=new CurrentClass(10,20);	
}}


