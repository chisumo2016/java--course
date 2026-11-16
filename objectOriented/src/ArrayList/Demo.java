package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
 * Collection - three types List -> has the class called ArrayList , LinkeedlIst , Queue has the class called Dequeue , Set has the class called Hashset linked Haset
 * ArrayList is the class impelement are list
 * collection works with object
 * Integer is the class
 * <> called generics
 *If you want to work with index value , should use List
 *List support multiple value
 */
public class Demo {

	public static void main(String[] args) {
		
		// This is interface
		Collection<Integer> nums = new ArrayList<Integer>(); 
		nums.add(6);
		nums.add(5);
		nums.add(8);
		nums.add(2);
		
		
		//print out
		//System.out.println(nums);
		
		//Enhance for Loop
		
		for(int n : nums) {
			
			System.out.println(n);
		}
		
		// To work with Index Value we use the List
		
		List<Integer> num = new ArrayList<Integer>(); 
		num.add(6);
		num.add(5);
		num.add(8);
		num.add(2);
		
		
		//print out
		System.out.println(num.get(2));
		System.out.println(num.indexOf(2));
		
		//Enhanced for Loop
		
		for(int n : num) {
			
			System.out.println(n);
		}
	}
}
