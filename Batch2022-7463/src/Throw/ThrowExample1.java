package Throw;

public class ThrowExample1 {
	 void validate_Age(int age) {
		if(age>12)
			throw new ArithmeticException("Not eligible for polio drops");
		else {
			System.out.println("Eligible for polio drops");
		}
	}

	public static void main(String[] args) {
		 ThrowExample1 obj=new  ThrowExample1 ();
		 obj.validate_Age(10);
System.out.println("rest of the code");
	}

}
