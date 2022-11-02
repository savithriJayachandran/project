package CustomizeException;

class MyException extends Exception {
   public MyException(String s)
   {
	   s="The girl is short";
       System.out.println("The string is : " +s);
   }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  try {
	            throw new MyException(" The string is:");
	        }
	        catch (MyException ex) {
	            System.out.println("Exception occurs");
	 
	            // Print the message from MyException object
	            System.out.println(ex.getMessage());
	        }
	    }
	}
