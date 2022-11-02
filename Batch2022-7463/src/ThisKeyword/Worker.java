package ThisKeyword;
import java.util.Scanner;
public class Worker {
String Name;
int WorkId;
String Field;
int salary;
Worker(String Name,int WorkId,String Field,int salary){
	this. Name= Name;
	this. WorkId= WorkId;
	this. Field= Field;
	this.salary=salary;}
void display(){
	System.out.println(" The worker name is: " +Name+ " The workerId is: "+ WorkId+
                       " The worker field is: " +Field+ " The salary is: " +salary);}
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the worker name :" );
String Name=sc.next();
System.out.println("Enter the worker Id :" );
int WorkId=sc.nextInt();
System.out.println("Enter the worker Field :" );
String Field=sc.next();
System.out.println("Enter the worker Salary :" );
int salary=sc.nextInt();
Worker w=new Worker( Name,WorkId,Field,salary);
w.display();
}}
