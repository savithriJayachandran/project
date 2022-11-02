package Sets;

import java.io.*;  
import java.util.*;

import java.util.SortedSet;
import java.util.TreeSet;

public class SetMethod {

	public static void main(String[] args) {
		Set<String> d = new LinkedHashSet<String>();   
		    d.add("Bheem");   
	        d.add("Babloo");   
	        d.add("Krish");   
	        System.out.println("The datas are: " +d);
	        
	        System.out.println("Does the Set contains 'Babloo'? : " + d.contains("Babloo"));   
	    	
	        System.out.println("\n  Does alldata contains in set d : "+ d.containsAll(d));  
	          
	        System.out.println("\n  The hash code value of set is :"+ d.hashCode());      
	
	        System.out.println("\n  Is data empty? : "+ d.isEmpty());  
	
	        System.out.println("size of the data is : " + d.size());
	        
	        
	        
	        ArrayList<String> nd = new ArrayList<String>();   
		    d.add("Maha");   
	        d.add("Moni");   
	        d.add("Jaanu");   
	        System.out.println("The datas are: " +nd);
	        
	        System.out.println("\n  The hash code value of set is :"+ nd.hashCode());      
	    	
	        System.out.println("\n  Is data empty? : "+ nd.isEmpty());  
	
	        System.out.println("size of the data is : " + nd.size());
	        
	        System.out.println("After Sorting");
            nd.addAll(d);
            Collections.sort(nd);
            for (String set : d) {
                System.out.print(" " + set);
            }
            
	        Iterator n= nd.iterator();  
	        System.out.println( "The NewData values are: " );   
	        while (n.hasNext()) 
	        {   
	            System.out.println(n.next());
	        }
	        
	            d.retainAll(nd);      
	            System.out.println("data after retaining newdata elements : " + d);  
	            
	         }}
