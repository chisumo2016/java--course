package ThisSupperMethod;

/**This and Super Method   */
/* every constructor super() is there*/
/*Every class in Java extends to Object class */
/*super() constructor - > Object class */

class A extends Object
{
	public A()
    {
		super();
    	System.out.println("in A");
    }
	
	public A(int n)
    {
		super(); 
    	System.out.println("in A int");
    }
}



class B extends A 
{
    public B()
    {
    	super(); // call the constructor of the super class- default
    	
    	System.out.println("in B");
    }
    
    public B(int n)
    {
    	this(); // will execute the constructor of the same class
    	System.out.println("in B int");
    }
}




public class Demo {

	public static void main(String[] args) {
		//B obj = new B(5);
		B obj = new B(5); //default
		

	}

}
