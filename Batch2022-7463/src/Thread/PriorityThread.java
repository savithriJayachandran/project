package Thread;
public class PriorityThread extends Thread{
public void run() {  
		System.out.println(Thread.currentThread());  
		}  
	public static void main(String argvs[])  {  
	    PriorityThread p=new PriorityThread();
		Thread th1 = new Thread(p,"first thread");
		System.out.println("before starting thread isAlive: "+th1.isAlive()); 
		
		Thread th2 = new Thread(p,"seocnd thread");  
		System.out.println("before starting thread isAlive: "+th2.isAlive()); 
		
        Thread th3 = new Thread(p,"third thread"); 
        System.out.println("before starting thread isAlive: "+th3.isAlive()); 
        
		th1.setPriority(6);  
		th2.setPriority(3);  
		th3.setPriority(9);
		
		 th1.start();
		  System.out.println("after starting thread isAlive: "+th1.isAlive()); 
		  
		 th2.start();
		  System.out.println("after starting thread isAlive: "+th2.isAlive()); 
		  
		 th3.start();
		  System.out.println("after starting thread isAlive: "+th3.isAlive());
		  
	    System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority()); 
		
		Thread.currentThread().setPriority(10);  
		System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());  
		}  
		}  
		
		
		
		
		

	