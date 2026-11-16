package RaceCondition;

/**
 * Race Condition
 * Mutation - mean you can change , you might be change value
 * Thread and Mutation are not good to work together
 */

class Counter
{
	int count;
	
	public synchronized void increment()
	{
		count++;
	}
}
public class Demo {

	public static void main(String[] args) throws InterruptedException{
		
		Counter c = new Counter();
		
		//using Lamda expression
		Runnable obj1 = () ->
				{
					for(int i = 1; i<=10000 ; i++)
					{
						c.increment();
					}
				
		};
		
		Runnable obj2 = () ->
		{
			for(int i= 1;	i<=10000 ; i++)
			{
				c.increment();
			}
		
		};
		
		
		
		
		//no idea with object, create thread
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(c.count);

	}

}
