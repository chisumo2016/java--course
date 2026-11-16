package AccessModifier;

class Lauch
{
	public void abc()
	{
		A obj = new A();
		System.out.println(obj.temp);
	}
}
public class A {
	
	int marks = 6;
	private int age = 6; // Access on the same class
	
	
	protected int temp = 35;
	
	
	public void show()
	{
		
	}

}
