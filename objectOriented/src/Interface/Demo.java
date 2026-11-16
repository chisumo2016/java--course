package Interface;
/*Interface **/
/*Designing the system ,you can use the interface or abstract */
/*Interface isn't  class, all method are public*/
/*Interface can't instantiated*/
/*Give you the method but I will not implement for u*/
/*Interface show a design*/
/*Interface keyword is implements*/
/*By default the variable are in final and static . You need to initializing them*/



interface A 
{
	int age = 12 ; // by final and static
	
	String area ="Momba";
	
	 void show();
	 void config();
}

class B implements A
{
	public void show()
	{
		System.out.println("in show");
	}
	
	public void config()
	{
		System.out.println("in config");
	}
}


public class Demo {

	public static void main(String[] args) {
		A obj;
		obj = new B();
		obj.show();
		obj.config();
		
		A.area = "Tanzania"; //final
		
		System.out.println(A.area);
	
	}

}
