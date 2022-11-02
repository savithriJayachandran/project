class Person
{
public void place()
{
System.out.println("mumbai");
}
}
class Ani extends Person
{
public void place()
{
System.out.println("Bangalore");
}
}
class Bindhu extends Ani 
{
public void place()
{
System.out.println("Singapore");
}
}
public class Test
{
public static void main(String args[])
{
Bindhu obj=new Bindhu();
obj.place();
}
}