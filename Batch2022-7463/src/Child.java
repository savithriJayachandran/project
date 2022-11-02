class Parent
{
 void play()
{
System.out.println("The father is playing");
}
}

class Child extends Parent
{
 void play()
{
System.out.println("The baby is playing");
}
public static void main(String args[])
{
Child obj1=new Child();
obj1.play();
}
}