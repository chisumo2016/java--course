package AnonymousInner;

/**Anonymous Inner Class : Doesnt have a name**/

class A
{
	public void show()
	{
		System.out.println("In A show ");
	}
}

//class B extends A
//
//{
//	public void show()
//	{
//		System.out.println("In B show ");
//	}
//}

public class Demo {

	public static void main(String[] args) {
		A obj = new A()
				//Anonymous inner class
				{
					
					public void show()
					{
						System.out.println("In NEW SHOW ");
					}
				};
				
				
				
		obj.show();
		
		
		//A obj1 = new B();
		//obj.show();
	}

}
