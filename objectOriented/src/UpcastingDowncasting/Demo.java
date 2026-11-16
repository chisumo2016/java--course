package UpcastingDowncasting;

/**Upcasting and Downcasting*/

class A
{
	public void show1()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show2()
	{
		System.out.println("in B show");
	}
}
public class Demo {

	public static void main(String[] args) {
		
		//A obj = new A();
		A obj = (A) new B(); // GOING UP  - UP CASTING
		obj.show1();
		
		
		B obj1 =(B) obj; // GOING UP  - DOWNING CASTING
		obj1.show2();

	}

}
