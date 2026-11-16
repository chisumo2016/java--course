package DynamicMethod;

/**Dynamic Method Dispatch */

class Computer
{
	
}

class Laptop extends Computer
{
	
}

class A
{
	public void show()
	{
		System.out.println("in A Show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B Show");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("in c Show");
	}

}
	

public class Demo {
	
	/**Dynamic Method Dispatch - POLYMOR*/

	public static void main(String[] args) {
		A obj = new A();
		obj.show();
		
		obj = new A();
		obj.show();
		
		obj = new C();
		obj.show();

	}

}
