package ThreadPriority;

/*
 *  Thread Priority and Sleep 
 *  Scheduler
 *  You can set the priority for thread max , min , 1-20
 *  sleep - going to waiting stage
 */


//This is thread

class A extends Thread
{
	public void run()
	{
		for(int i = 0; i <=100 ; i++)
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

class B extends Thread
{
	public void run()
	{
		for(int i = 0; i <=100 ; i++)
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
		
		A obj = new A();
		B obj1 = new B();
		
		//System.out.println(obj.getPriority());
		
		//obj1.setPriority(Thread.MAX_PRIORITY);
		
		obj.start();
		
		try {
			
			Thread.sleep(5);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		obj1.start();

	}

}
