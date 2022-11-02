package Interface;
import java.util.Scanner;
interface Ice{
	void butterscotch();}
interface Choco{
	void kitkat() ;}
interface Juice{
	void sclice() ;}
class Ra implements Ice,Choco,Juice{
public void butterscotch() {
	int a=10;
    System.out.println("number of icecream is: "+a);
	}
   public void kitkat() {
   int b=7;
    System.out.println("number of Chocolate is: "+b);
	}
   public void sclice() {
   int c=5;
    System.out.println("number of Juice is: "+c);
	}
	public static void main(String[] args) {
		Ra obj=new Ra();
		obj. butterscotch();
	    obj.kitkat();
	    obj.sclice();
	}}

