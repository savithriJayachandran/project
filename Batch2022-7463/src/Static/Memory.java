package Static;

public class Memory {
 static String s="krish";
 String n="Naveen";
void display()
     {
	 System.out.println( s+ " has extrodinary memory power");
	 System.out.println( n+ " has good  memory power");
     }
static void print()
     {
	 System.out.println( s+ " has extrodinary memory power");
     }
public static void main(String[] args) 
	 {
		Memory m=new Memory ();
		m.display();
		Memory w=null;
		String n=m.n;
		System.out.println(n+ "  He has extrodinary memory power ");
        }

}
