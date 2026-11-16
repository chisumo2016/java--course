package MapFilterReduceSorted;

/**
 *
 * Map Filter Reduce Sorted 
 */

import java.util.Arrays;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
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
		
		
		//Function<Integer , Integer> fun = n -> n* 2;;
		
//		Function<Integer , Integer> fun = new Function<Integer, Integer>()
//				
//				{
//					public Integer apply(Integer n) {
//						
//						return n* 2;
//						
//					}
//			
//				};
		
		
		//1
//		Predicate<Integer> p = new Predicate<Integer> () {
//
//			
//			public boolean test(Integer n) {
//				if(n%2 == 0)
//				return true;
//				else
//					return false;
//			}
//			
//			
//		};
		
		//2 lambda  expression with functional interface
				//Predicate<Integer> p = n -> (n%2 == 0);
		
		//shorter version from above better
		int result = nums.stream()
			.filter( n -> n%2 == 0)
			.map(n -> n* 2)
			.reduce(0, (c,e) -> c+e);
		
		System.out.println(result);
		
		
		// Sorted Value with Stream
		
		Stream<Integer> sortedValues = nums.stream()
				.filter( n -> n%2 == 0)
				.sorted();
			
		
		sortedValues.forEach(n -> System.out.println(n));
		
		
		// You want to do filtering with multiple thread
		
		Stream<Integer> sortedValues2 = nums.parallelStream()
				.filter( n -> n%2 == 0)
				.sorted();
			
		
		sortedValues2.forEach(n -> System.out.println(n));
		
			
		
	}
		// Use the Stream API
	

}