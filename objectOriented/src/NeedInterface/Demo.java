package NeedInterface;



/*Need of Interface ? */
/*Do you need laptop ? */

/*Developer depend on computer , can be desktop , laptop*/
/*we can use Interface and abstract**/

interface Computer
{
	void code();
	
}

class Laptop implements Computer
{
	public void code()
	{
		System.out.println("coding , compile , run");
	}
}

class Desktop implements Computer
{
	public void code()
	{
		System.out.println("coding , compile , run:faster");
	}
}

class Developer
{
	public void devApp(Computer lap)
	{
		lap.code();
	}
}

public class Demo {

public static void main(String[] args) {
		
	
	//Interface refrence
	    Computer lap  = new Laptop();
	    Computer desk = new Desktop();
	    
		Developer bernard = new Developer();
		bernard.devApp(desk);
		
	}
}
