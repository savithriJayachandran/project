package Interface;
interface A{
	void age();
}
interface D{
	void colour();
}
interface C{
	void height();
}
public class MultipleInheritance implements A ,D, C{
	public void age(){
	System.out.println("The Age is: 21 ");
}
public void colour(){
	System.out.println("The Colour is: Black ");
}
public void height(){
	System.out.println("The Height is: 210.40 ");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 MultipleInheritance obj=new  MultipleInheritance();
		 obj.age();
		 obj.colour();
		 obj.height();
		 }}
