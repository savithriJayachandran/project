 class Bike
{
public void B1()
{
String name="RX100";
System.out.println("Name:" +name);
}
}
class Bike1 extends Bike
{
public void B2()
{
String colour="red";
System.out.println("Colour:" +colour);
}
}
public class Main
{
public static void main(String args[])
{
Bike b =new Bike();
b.B1();
Bike1 b1=new Bike1();
b1.B2();

}}