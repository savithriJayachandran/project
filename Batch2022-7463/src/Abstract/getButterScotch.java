package Abstract;
abstract class IceCream{
abstract void getVenila(String name);
abstract void getChocolate(String color);
abstract void getBlueberry(String properties);
}
class person extends IceCream{
void getVenila(String name)
{
System.out.println("Name of the company is:");
}
void getChocolate(String color)
{
System.out.println("color of the IceCream is:");
}
void getBlueberry(String properties)
{
System.out.println("properties of the IceCream is:");
}
void getButterScotch(String count)
{
System.out.println("count of the IceCream is:");
}
public static void main(String arg[])
{
	person p=new person();
p.getVenila( "Dairy");
p.getChocolate( "Brown");
}}