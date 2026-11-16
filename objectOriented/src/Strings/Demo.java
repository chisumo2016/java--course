package Strings;

//String
public class Demo {

	public static void main(String[] args) {
		
		String name = new String( "navin"); //String name = "navin"
		
		System.out.println("hello " + name);
		
		System.out.println(name.hashCode());
		
		// check the character location
		System.out.println(name.charAt(1));
		
		//concanite two string
		System.out.println(name.concat("Radin"));

	}

}
