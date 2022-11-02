class Subtract
{
public int sub(int a, int b)
{
return (a-b);
}
public int sub(int a,int b,int c)
{
return (a-b-c);
}
}
class Overloading
{
public static void main(String args[])
{
Subtract obj=new Subtract();
obj.sub(20,10);
obj.sub(50,10,20);
}
}