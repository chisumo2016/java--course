package strings;

public class reverseString {
	
	public static void main(String[] args){
		String input  = "Simplilearn";
		
		//Manipulation
		StringBuilder input1 = new StringBuilder();
		
		input1.append(input);
		input1 = input1.reverse();
		
		System.out.println("The reverse string is : "+input1);
	}

}
