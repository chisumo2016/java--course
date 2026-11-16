package AccessModifier;

class C extends A  // C is the sub class of A
{
	public void abc()
	{
		A obj = new A();
		System.out.println(obj.temp);
	}
}

public class Demo {

	public static void main(String[] args) {
		
		A obj = new A();
		
		System.out.println(obj.marks);
		System.out.println(obj.temp);
		
		
		
		A obj1 = new A();
		
		System.out.println(obj1.marks);
		

	}

}
