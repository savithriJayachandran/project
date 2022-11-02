package inhertance;
 class A
{
	String name="Maha";
}
public class B extends A
{
	void print()
	{
	System.out.println("The Name is :" +name);
}
public static void main(String arg[])
{
	B obj=new B();
	obj.print();
}
}
