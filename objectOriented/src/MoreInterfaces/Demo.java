package MoreInterfaces;

// More Interface

// support multiple inheritance

// class to class ->  extends
// interface  to interface ->  extends
// class to interface  -> implements 

interface A 
{
	int age = 12 ; // by final and static
	
	String area ="Momba";
	
	 void show();
	 void config();
}

interface X
{
	void run();
}

interface Y extends X
{
	
}



class B implements A, X ,Y
{
	public void show()
	{
		System.out.println("in show");
	}
	
	public void config()
	{
		System.out.println("in config");
	}
	
	public void run()
	{
		System.out.println("run");
	}
}


public class Demo {

	public static void main(String[] args) {
		A obj;
		obj = new B();
		obj.show();
		obj.config();
		
		
		
	   X obj1 = new B();
	   obj1.run();
		
		
	
	}

}
