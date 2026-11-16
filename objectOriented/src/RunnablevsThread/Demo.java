package RunnablevsThread;
/*
 * Runnable vs Thread
 * Multiple way to create  a thread
 */
/*
 *  Thread Priority and Sleep 
 *  Scheduler
 *  You can set the priority for thread max , min , 1-20
 *  sleep - going to waiting stage
 *  Java doesn't support multiple inheritance
 *  No start() in Runnable 
 */



//This is thread

class Z
{
	
}

class A implements Runnable
{
	public void run()
	{
		for(int i = 0; i <=5 ; i++)
		{
			System.out.println("Hi");
			
			try {
				
				Thread.sleep(2);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}

class B implements Runnable
{
	public void run()
	{
		for(int i = 0; i <=5 ; i++)
		{
			System.out.println("HELOO");
			try {
				
				Thread.sleep(2);
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		Runnable obj = new A();
		Runnable obj1 = new B();
		
		//no idea with object, create thread
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();
		
		
		
		t2.start();

	}

}