package Queue;
import java.util.*;
public class QueueEx {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
        queue.add("java");
		queue.add("sql");
		queue.add("css");
		queue.add("html");
		queue.add("c++");
		queue.add("python");
		System.out.println("Queue (queue)Size: " + queue.size());
		
		String sub[] = {"Data Structure",".net","c","web designing","dbms"};
		Queue<String> q = new LinkedList<>();
		Collections.addAll(q,sub);
		System.out.println("Queue (q)Size: " + q.size());
		System.out.println(q);
		
		queue.addAll(q);
		System.out.println("The subjects after combining: "+queue);
		
		queue.offer("rdbms");
		System.out.println("After offer the String in queue: "+queue);
		
		q.offer("oracle");
		System.out.println("After offer the String in q array: "+q);
		
		System.out.println("The poll String is: " +queue.poll());
		System.out.println("After  poll String is: " +queue);
		
		System.out.println("The poll String is: " +q.poll());		
		System.out.println("After poll String is: " +q);	
		
		System.out.println("The peek String is: " +queue.peek());
		System.out.println("After the peek String is: " +queue);
		
		System.out.println("The peek String is: " +q.peek());
		System.out.println("After the peek String is: " +q);
		

	}

}
