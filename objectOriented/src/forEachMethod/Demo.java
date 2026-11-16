package forEachMethod;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * forEach Method
 *  Consumer is Functional Interface 
 *  gives a one value at a time
 */

public class Demo {

	public static void main(String[] args) {
		
			List<Integer> nums = Arrays.asList(4, 5 ,7, 3, 2 ,6);
			
			//1
			
//			Consumer<Integer> con = new Consumer<Integer>() {
//				
//				public void accept(Integer n)
//				{
//					System.out.println(n);
//				}
//			};
			
			
			//2 : is functional interface /lambda express
			
			Consumer<Integer> con = n-> System.out.println(n);
				
		
		     nums.forEach(con);
			
		
			//nums.forEach(n->System.out.println( n));
			
			
			
			
	
		//filter only even number-> out put to be 24 (4 , 2 6 )  4x2  8 , 2x2 = 4 , 6x2 =12  total 24
		int sum = 0;
		
		for(int n :nums)
		{
			if(n%2 == 0) 
			{
				n = n*2;
				sum = sum + n ;
				
			}
		}
		System.out.println(sum);
	

	}

}
