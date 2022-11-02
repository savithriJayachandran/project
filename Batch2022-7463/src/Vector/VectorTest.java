package Vector;
import java.util.Vector;
public class VectorTest {
public static void main(String[] args) {

Vector<Integer> v=new Vector<Integer>();
v.add(12);
v.add(16);
v.add(20);
v.add(135);
v.add(120);
v.add(151);
v.add(500);
v.add(07);

System.out.println("The numbers are: " +v);
System.out.println("The Capacity of vector v is : " +v.capacity());

Integer firstElement=v.firstElement();
System.out.println("The first element is :" +firstElement);

Vector<Integer> v1=new Vector<Integer>();
v1.add(107);
v1.add(507);
v1.add(1107);
v1.add(7707);
v1.add(1207);
v1.add(4507);
v1.add(307);
v1.add(707);

System.out.println("The numbers are: " +v1);
System.out.println("The Capacity of vector v1 is : " +v1.capacity());

Integer lastElement=v1.lastElement();
System.out.println("The last element is :" +lastElement);

v.addAll(v1);
System.out.println("The Elements after combining"+v);

Integer []arr=new Integer[16];
v.copyInto(arr);

System.out.println("Elements in an array arr:");
for(Integer num:arr) 
{
	System.out.println(num);
}

Object obj= v.clone();
System.out.println("The elements in v vector are: "+obj);
}}
