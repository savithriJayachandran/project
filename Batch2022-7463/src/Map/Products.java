package Map;
import java.util.HashMap;

public class Products {
    int quantity;
	String productname;
	double rate;

	public Products(int q, String pn,double r)
	{
	    this.productname=pn;
		this.quantity=q;
		this.rate=r;
	}

public static void main(String[] args) {
		
	 HashMap<Integer,Products> hm= new HashMap<Integer,Products>();
		 Products p1= new Products (10,"Biscuits",104.5);
		 Products p2= new Products(15,"IceCreams",500.10);
		 Products p3= new Products(20,"Chocolates",10000.225);
		 Products p4= new Products(5,"Juice",205.5);
		 Products p5= new Products(10,"Cakes",6000.5);
    hm.put(1,p1);
	hm.put(2,p2);
	hm.put(3,p3);
	hm.put(4,p4);
	hm.put(5,p5);
	 System.out.println(hm);
	 for(HashMap.Entry<Integer, Products> entry:hm.entrySet())
	 {    
	        int key=entry.getKey();  
	        Products b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.quantity+" "+b.productname+" "+b.rate+" " );   
	        }}}

