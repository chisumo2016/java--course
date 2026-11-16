package TryResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * try with resources 
 * finally using the close the resource
 */
public class Demo {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = 0;
		//BufferedReader bf = null;
		
		
		//1: finally
		/*try
		{
			//InputStreamReader in = new InputStreamReader(System.in);
			 bf    = new BufferedReader(new InputStreamReader(System.in));
			
			num = Integer.parseInt(bf.readLine());
			
			
		}
		
		
		finally  // close resource , file input connection
		{
			bf.close();
		}*/
		
		//2: will be closed automatically
		try (BufferedReader br  = new BufferedReader(new InputStreamReader(System.in)))
		{
			
				num = Integer.parseInt(br.readLine());
				System.out.println(num);
		}
	}

}
