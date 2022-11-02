package Hashtable;
import java.util.*; 

public class HashtableEx1 {
	int rollno;    
		String name;    
public HashtableEx1(  int rno ,String n ) 
		{    
		   this.rollno = rno ;
		   this.name = n;
		}    
public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Hashtable<Integer,HashtableEx1> ht=new Hashtable<Integer,HashtableEx1>();  
		 HashtableEx1 b1=new  HashtableEx1(101," Ammu ");    
	     HashtableEx1 b2=new  HashtableEx1(102," Baanu ");    
	     HashtableEx1 b3=new  HashtableEx1(103," Appu ");
	     
	      ht.put(1,b1);  
		  ht.put(2,b2);  
		  ht.put(3,b3);  
		  System.out.println(ht);
		  
		   
		  //Traversing map  
	       for(Map.Entry<Integer,HashtableEx1  > entry:ht.entrySet()){    
	           int key=entry.getKey();  
	           HashtableEx1  b=entry.getValue();  
	           System.out.println(key+" St Student:");  
	           System.out.println(b.rollno+" "+b.name+" ");   
		   
		   System.out.println("Before remove: "+ ht);    
	       ht.remove(102);  
	       System.out.println("After remove: "+ ht);
	       
	       
	        }}}

