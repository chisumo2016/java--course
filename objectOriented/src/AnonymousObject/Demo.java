package AnonymousObject;


class A 
{
	public A()
	{
		System.out.println("object created");
	}
	
	public void show() {
		System.out.println("in A show");
	}
}

public class Demo {

	public static void main(String[] args) {
		
		/*reference creation*/
		 /*A obj;*/
		 
		//creating the object and assign the value to obj
		/*obj = new A();*/
		/*obj.show();*/
		
		//Anonymous object , you can reuse them
		new A().show();

	}

}
