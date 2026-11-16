package List;


import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set in Java
 * Support unique value
 * You cannot add the repeated value
 * Will not give the value in sorted format
 * doesn't index value
 * collection of unique value
 * collection framework
 * USE Collection
  
 */
public class Demo {

	public static void main(String[] args) {
		
		
		// To work with Index Value we use the List
		
		
		Set<Integer> num = new HashSet<Integer>(); 
		num.add(62);
		num.add(54);
		num.add(82);
		num.add(21);
		
		//sorting VALUE
		Set<Integer> num1 = new TreeSet<Integer>(); 
		num1.add(62);
		num1.add(54);
		num1.add(82);
		num1.add(21);
		
		
		//Collection
		Collection<Integer> num2 = new TreeSet<Integer>(); 
		num2.add(62);
		num2.add(54);
		num2.add(82);
		num2.add(21);

		
		// Access
		Iterator<Integer> values = num2.iterator();
		
		
		//print value from 
		while(values.hasNext())
		System.out.println(values.next());
		
	
		
		//print out
	
		
		//Enhance for Loop
		
		for(int n : num) {
			
			System.out.println(n);
		}
		
		
				
	}

}
