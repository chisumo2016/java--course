package LambdaReturn;

/**Lambda Expression with return*/


/**
 * Lambda expression works with Functional interface
 * Has method return something
 */

@FunctionalInterface 
interface A
{
	int add(int i , int j);
}


public class Demo {

	public static void main(String[] args) {
		
	 A obj = ( i ,j) -> i + j;
			
			 int result = obj.add(7, 9);
			 System.out.println(result);

	}

}

 
