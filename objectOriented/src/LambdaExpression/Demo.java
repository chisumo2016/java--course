package LambdaExpression;



/*

 * Types of Interface  
 
 * Functional Interface/SAM Interface  Only 0ne Method - java 8

 * Only declare the interface
 * All method are public abstract
 * /*

 * Types of Interface  
 
 * Functional Interface/SAM Interface  Only 0ne Method - java 8

 * Only declare the interface
 * All method are public abstract
 * Lambada expression - JAVA 8 - SIMPLIFY ANN CLASS
 * */

@FunctionalInterface 
interface A
{
	void show(int i);
}


public class Demo {

	public static void main(String[] args) {
		
		//Anonymous class
		//A obj = (i)->System.out.println("In show" + i);
		A obj = i->System.out.println("In show" + i);
	
		
		obj.show(5);

	}

}

 