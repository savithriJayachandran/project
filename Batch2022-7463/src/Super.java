 public class Super
{
int a=100;
int b=200;
public void superDemo(){
System.out.println("This is a super class");
}
}
 class Sub extends Super
{
public void subDemo()
{
System.out.println("This is a sub class");
}
public static void main(String args[]){
Sub obj=new Sub();
obj.superDemo();
obj.subDemo();
System.out.println(obj.a);
System.out.println(obj.b);
}
}  