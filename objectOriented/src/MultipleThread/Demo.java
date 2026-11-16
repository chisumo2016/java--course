package MultipleThread;
/*
 * Multiple Threads 
 * framework will build for us
 * excute in same method 
 */

//This is thread

class A extends Thread
{
	public void run()
	{
		for(int i = 0; i <=10 ; i++)
		{
			System.out.println("Hi");
		}
		
	}
}

class B extends Thread
{
	public void run()
	{
		for(int i = 0; i <=10 ; i++)
		{
			System.out.println("HELOO");
		}
		
	}
}

public class Demo {

	public static void main(String[] args) {
		
		A obj = new A();
		B obj1 = new B();
		
		obj.start();
		obj1.start();

	}

}
