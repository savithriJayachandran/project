 class Problem
{
int a=10;
int b=20;
}
class A1 extends Problem
{
void add()
{
System.out.println("a+b:");
}
}
class B1 extends Problem
{
void sub()
{
System.out.println("a-b:" );
}
}
class Solve
{
public static void main(String args[])
{
A1 a=new A1();
B1 b=new B1();
a.add();
b.sub();
}
}