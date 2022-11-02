package Constructor;
  class Default
{
	String Name ="Navi";
	int age=25;
}
 class Name extends Default
 {
	 void say()
	 {
	 System.out.println("The name is:" +Name);
	 System.out.println("The Age is:" +age);
	 }
 public static void main (String args[])
 {
 Name obj=new Name();
 obj.say();
 }
 }
