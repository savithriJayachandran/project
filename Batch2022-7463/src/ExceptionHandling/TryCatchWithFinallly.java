package ExceptionHandling;

public class TryCatchWithFinallly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
String str="maha";
System.out.println("The string is: " +str );
char ch= str.charAt(1);
}

catch(Exception e)
{
	System.out.println("Classnot found Exception" +e);
}
finally 
{
	System.out.println("Print the String as per the need");
}
}
}