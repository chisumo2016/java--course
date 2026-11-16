package DuckingException;



/**
 * Ducking Exception using throws
 */
class BernardException extends Exception
{
	public BernardException(String string)
	{
		super(string);
	}
}

class A
{
	public void show() throws  ClassNotFoundException
	{
		Class.forName("Calc");
		
		
//		try {
//			Class.forName("Demo");
//		}
//		catch(ClassNotFoundException e)
//		{
//			System.out.println("Not able to find the class"  + e);
//		}
	}
}

public class Demo {

	static {
		
		System.out.println("Class Loaded");
	}
	
	
	public static void main(String[] args) {
		
		A obj = new A();
		
		try {
			obj.show();
		}
		catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		
	}

}