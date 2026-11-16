package InnerClass;

/*Inner Class ,yOU CANT USE STATIC IN UPPER CLASS**/


class A
{
	int age ;
	
	
	public void show()
	{
		System.out.println("In Show ");
	}
	
	class B
	{
		public void config()
		{
			System.out.println("In config ");
		}
	}
	
	static class C
	{
		public void twende()
		{
			System.out.println("In Twende");
		}
	}
}


public class Demo {

	public static void main(String[] args) {
		 A obj = new A();
		 obj.show();
		 
		 //inner
		 A.B obj1 = obj.new B();
		 obj1.config();
		 
		 //STATIC CLASS
		 A.C obj2 = new A.C();
		 obj2.twende();

	}

}
