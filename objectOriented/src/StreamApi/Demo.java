package StreamApi;

/**
 * Need of Stream API 
 * Stream is interface
 */

import java.util.Arrays;

import java.util.List;
import java.util.stream.Stream;



/**
 * Need of Stream API 
 * Stream is an Interface 
 * Return the object of stream
 * We have all value in s1
 * Once you use the stream you cant reuse it
 * Benefit of stream eg filter
 */
public class Demo {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(4, 5 ,7, 3, 2 ,6);
		List<Integer> nums4 = Arrays.asList(4, 5 ,7, 3, 4 ,6);
		
		//stream
		Stream<Integer>  s1 = nums4.stream();
		Stream<Integer>  s2 =s1.filter(n ->n%2 == 0);
		Stream<Integer>  s3 = s2.map(n -> n* 2);
		int result = s3.reduce(0, (c,e) -> c+e); // reduce will give a single value
		
		//s1.forEach(n->System.out.println( n));
		//s2.forEach(n->System.out.println( n));
	
		//s3.forEach(n->System.out.println( n));
		
		
		
		
		//shorter version from above better
		nums4.stream()
			.filter(n ->n%2 == 0)
			.map(n -> n* 2)
			.reduce(0, (c,e) -> c+e);
		
		System.out.println(result);
		
		
		//1 : Normal for loop
//				for(int i = 0 ; i<nums.size(); i++)
//				{
//					System.out.println(nums.get(i));
//				}
//				
//				//2 : Enhanced For Loop
//				for(int n : nums)
//				{
//					System.out.println(n);
//				}
//				
//				//3 : forEach Method Give a one value at a time This is the better way , n will give you one value
//					nums.forEach(n->System.out.println( n));
//			
//				//filter only even number-> out put to be 24 (4 , 2 6 )  4x2  8 , 2x2 = 4 , 6x2 =12  total 24
//				int sum = 0;
//				
//				for(int n :nums)
//				{
//					if(n%2 == 0) 
//					{
//						n = n*2;
//						sum = sum + n ;
//						
//					}
//				}
//				System.out.println(sum);
//	

	}
	
	// Use the Stream API
	

	
	

}
