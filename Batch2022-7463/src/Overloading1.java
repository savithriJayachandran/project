class Multiple
{
static int mul(int a,int b)
{
return (a*b);
}
static double mul(double a,double b,double c)
{
return (a*b*c);
}
}
class Overloading1
{
public static void main(String args[])
{
System.out.println(Multiple.mul(7,3));
System.out.println(Multiple.mul(7.3,8.5,14.2));
}
}