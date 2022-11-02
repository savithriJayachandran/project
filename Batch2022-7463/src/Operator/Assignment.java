package Operator;
class Assignment{
	public static void main(String arg[]){
	int a=100;
	int b=200;
	int c=0;
c=a+b;
	System.out.println("c=a+b " +c);
	c+=a;
	System.out.println("c+=a = " +c);
	c-=b;
	System.out.println("c-=b = " +c);
	c*=b;
	System.out.println("c*=b = " +c);
	c/=a;
	System.out.println("c/=a = " +c);
	c%=b;
	System.out.println("c%=b = " +c);
	c<<=a;
	System.out.println("c<<=a = " +c);
	c&=b;
	System.out.println("c&=a = " +c);
	c^=b;
	System.out.println("c^=a = " +c);
	}}