package AbstractKeyword;

/*Abstract Keyword  , you can't create an object of abstract , can have normal method  , have both  **/


abstract class Car
{
	public abstract void drive(); // declare the method 
	public abstract void fly();
	
	
	
	
	public void playMusic()
	{
		System.out.println("play music");
	}
}

abstract class WagonR extends Car
{
	public void drive()
	{
		System.out.println("Driving ");
	}
	
	public void fly()
	{
		System.out.println("flying ....");
	}
}


class UpdateWagonR extends WagonR  // concrete class
{
	
	
	public void fly()
	{
		System.out.println("flying ....");
	}
}




public class Demo {

	public static void main(String[] args) {
		
		Car obj = new UpdateWagonR();
		obj.drive();
		obj.playMusic();
		obj.fly();

	}

}
