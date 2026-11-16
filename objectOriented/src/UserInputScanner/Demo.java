package UserInputScanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * User Input using BufferedReader and Scanner
 * println() belong to the class PrintStream
 * BufferedReader is the resource 
 * good idea to close the resources
 */
public class Demo {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println("Enter a number");
		
		// Taking Input from the user with Buffer Reader
		/*InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(in);
		
		int num = Integer.parseInt(bf.readLine());
		System.out.println(num);
		
		bf.close();*/
		
		
		//Using a scanner
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		System.out.println(num1);
		
	}

}
