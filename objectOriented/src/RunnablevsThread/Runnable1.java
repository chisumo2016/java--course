package RunnablevsThread;



/*
*  Thread Priority and Sleep 
*  Scheduler
*  You can set the priority for thread max , min , 1-20
*  sleep - going to waiting stage
*  Java doesn't support multiple inheritance
*  No start() in Runnable 
*  converting the ann class to lambda exp
*/



//This is thread

class Y
{
	
}

//class A implements Runnable
//{
//	public void run()
//	{
//		for(int i = 0; i <=5 ; i++)
//		{
//			System.out.println("Hi");
//			
//			try {
//				
//				Thread.sleep(2);
//				
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
//	}
//}

//class T implements Runnable
//{
//	public void run()
//	{
//		for(int i = 0; i <=5 ; i++)
//		{
//			System.out.println("Using Lambda Expression");
//			try {
//				
//				Thread.sleep(2);
//				
//			} catch (InterruptedException e) {
//				
//				e.printStackTrace();
//			}
//		}
//		
//	}
//}

public class Runnable1 {

	public static void main(String[] args) {
		
		//using Lamda expression
		Runnable obj = () ->
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
		};
		
		Runnable obj1 = () ->
		{
			for(int i = 0; i <=5 ; i++)
			{
				System.out.println("Tanzania with Lambda expression");
				
				try {
					
					Thread.sleep(2);
					
				} catch (InterruptedException e) {
					
				e.printStackTrace();
			}
		}
};
		
		//no idea with object, create thread
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		
		t1.start();
		
		
		
		t2.start();

	}

}
