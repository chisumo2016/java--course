package CustomException;

/*Custom Exception
 * create a class
 * extends to exception
 * pass in constructor
 *  **/

class BernardException extends Exception
{
	public BernardException(String string)
	{
		super(string);
	}
}

public class Demo {

	public static void main(String[] args) {
		int i = 20 ;
		int j = 0 ;
		
		
		
		
		try 
		{
			j = 18/i ;
			
			if(j == 0)
				throw new BernardException("I don't want to print zero");
			
			
		}
		//only there's exception
		 catch(BernardException e)
		{
			 j = 18/i;
			 System.out.println("Cannot divide by zero . "  + e);
			 
			 //System.out.println(That the default out. " );
		}
		
		
		catch (Exception e)
		{
			System.out.println("Something went wrong ...... " + e);
		}
		
		
		System.out.println(j);
		
		
		System.out.println("Bye");

	}

}
