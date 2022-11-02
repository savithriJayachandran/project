package Map;
import java.util.HashMap;
public class Map {
public static void main(String[] args) {
	HashMap<String, Integer> people = new HashMap<String, Integer>();
	 System.out.println(people);
	 System.out.println(" Is the map is empty? : "+people.isEmpty());
		 // values (Name, Age)
		    people.put("maha", 32);
		    people.put("navi", 30);
		    people.put("krish", 33);
		    System.out.println(" The name and age are: " +people);
		    
		    HashMap<String, Integer> p = new HashMap<String, Integer>();
	        p.put( "Moni", 10);
	        p.put( "Bheem",20);
	        p.put( "Jaanu",30);
	        people.putAll(p);
	        System.out.println(people);
		    System.out.println(" The size is: " +people.size());
		    
		    people.replace("krish", 02);
	        people.replace("navi", 01);
	        System.out.println("New Map: " + people);
for (String i : people.keySet()) {
		      System.out.println("Name of the employee : " + i + " Age of the employee : " + people.get(i));
		      int hash = people.hashCode();
		      System.out.println(hash);
		     }}}
