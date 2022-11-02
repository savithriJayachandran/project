package LinkedList;
import java.util.*;
public class link {
public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> c=new LinkedList<String>();
	c.add("Tcs");
	c.add("Cgi");
	c.add("Infosys");
	c.add("Wibro");
	c.add("Capgemini");
	c.add("Accenture");
    System.out.println("The IT companies are: " +c);
	c.removeFirst();
	System.out.println("After removing : "+c);
	LinkedList<String> c1=new LinkedList<String>();
c1.add("Mahendra");
c1.add("Toyato");
c1.add("BMW");
c1.add("Ford");
c1.add("Logitics");
c1.add("Mothersom");
System.out.println("The Manual companies are: " +c1);
c1.removeLast();
System.out.println("After removing : "+c1);
c.addAll(c1);
System.out.println("The companies after combining"+c);
}}
