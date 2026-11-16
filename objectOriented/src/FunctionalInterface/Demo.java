package FunctionalInterface;

/*

 * Types of Interface  
 
 * Functional Interface/SAM Interface  Only 0ne Method - java 8

 * Only declare the interface
 * All method are public abstract
 * Lambada expression
 * */

@FunctionalInterface 
interface A
{
	void show();
}

//class B implements A
//{
//	public void show()
//	{
//		System.out.println("In show");
//	}
//}

public class Demo {

	public static void main(String[] args) {
		
		//Anonymous class
		A obj = new A() 
		{
			public void show()
			{
				System.out.println("In show");
			}
		};
		obj.show();

	}

}
