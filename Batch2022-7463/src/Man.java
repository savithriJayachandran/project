class Human 
{
protected void display() 
{
System.out.println("I am an Human");
}
}
class Man extends Human 
{
public static void main(String[] args)
{
Man obj = new Man();
obj.display();
}
}