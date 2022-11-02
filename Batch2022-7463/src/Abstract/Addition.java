package Abstract;
abstract class MyTest{
	abstract void calculate(int a,int b);}
class Subtraction extends MyTest{
	void calculate(int a,int b){
int c=a-b;
	System.out.println("the subtraction:  "+c);}}
class Multiplication extends MyTest{
	void calculate(int a,int b){
		int c=a*b;
		System.out.println("the multiplication:  "+c);}}
class Addition extends MyTest{
 void calculate(int a,int b){
	 int c=a+b;
	System.out.println("the addition: "+c);}
public static void main (String arg []){
	MyTest a=new Addition();
	a.calculate(10,20);
	MyTest s=new Subtraction();
	s.calculate(4,5);
	MyTest m=new Multiplication();
	m.calculate(6,8);}}	

