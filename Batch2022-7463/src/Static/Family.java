package Static;

public class Family {
	String child1;
	String child2;
	static String fatherName="Jayachandran's";
	Family(String child1,String child2)
	{
		this.child1=child1;
		this.child2=child2;
	}
	void display ()
	{
		System.out.println( fatherName+ " two children are");
		System.out.println( fatherName+ " Elder child name is: "    + child1);
		System.out.println( fatherName+ " Younger child name is: "  + child2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Family f=new Family("Santhosh","Maha");
		f.display();
	}}
