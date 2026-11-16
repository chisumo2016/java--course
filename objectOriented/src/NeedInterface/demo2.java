package NeedInterface;

abstract class Computer
{
	public abstract void code();
	
}

class Laptop extends Computer
{
	public void code()
	{
		System.out.println("coding , compile , run");
	}
}

class Desktop extends Computer
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

public class Demo2 {

public static void main(String[] args) {
		
	
	    Computer lap  = new Laptop();
	    Computer desk = new Desktop();
	    
		Developer bernard = new Developer();
		bernard.devApp(desk);
		
	}
}