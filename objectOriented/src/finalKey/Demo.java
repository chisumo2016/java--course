package finalKey;

/**Final keyword (constant) - used variable, method - no one can ovverride ,and class (stoping inheritance)*/

 class Calc
{
	public final void show()
	{
		System.out.println("in calc show");	
	}
	
	public void add (int a , int b)
	{
		System.out.println(a+b);	 
	}
	
}
 class Advanc extends Calc
	{
		public void show()
		{
			System.out.println("By John");	
		}
	}
 
 
public class Demo {

	public static void main(String[] args) {
		final int num = 8;
		    //num = 10;
		    
	   System.out.println(num);
	   
	   Calc obj = new Calc();
	   obj.show();
	   obj.add(5, 5);
	   
	   Advanc obj1 = new Advanc();
	   obj1.show();
	   obj1.add(5, 5);
	}

}
