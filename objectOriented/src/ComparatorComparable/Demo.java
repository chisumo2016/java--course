package ComparatorComparable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Comparator vs Comparable
 * If you have collection and you want to sort
 * Its interface 
 * sort work with integer
 * Our student doesn't implement 
 * Natural sorting u can use comparable
 * */


class Student implements Comparable<Student>
{
	int age ;
	String name ;
	
	
	
	
	public Student(int age, String name) {
		
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}

	
	public int compareTo(Student that) {
		
		// compare age 
        if (this.age % 10 > that.age)
            return 1;
        else
            return -1;
	}
	
	
}

public class Demo {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(4);
		nums.add(3);
		nums.add(7);
		nums.add(9);
		
		
		
		//System.out.println(nums);
		
		//Sort the value
		
	    //Collections.sort(nums);
		
		//sort based on your own logic  based on the last digit
	   
	    
	    Comparator<Integer> com = new Comparator<Integer>()  {
	    	
	    	  @Override
	    	    public int compare(Integer i, Integer j) {
	    	        if (i % 10 > j % 10)
	    	            return 1;
	    	        else
	    	            return -1;
	    	    }
	    	};
	    	
	
	    
	    List<Integer> nums2 = new ArrayList<>();
	    nums2.add(43);
	    nums2.add(31);
	    nums2.add(72);
	    nums2.add(29);
		
		Collections.sort(nums2, com);
		
		//Collections.sort(nums2);
		
		System.out.println(nums2);
		
		
		Comparator<Student> stud = new Comparator<Student>()  {
	    	
	    	  @Override
	    	    public int compare(Student i, Student j) {
	    		  
	    		  // compare age 
//	    	        if (i.age % 10 > j.age)
//	    	            return 1;
//	    	        else
//	    	            return -1;
	    	        
	    	        return i.age > j.age ? 1 : -1;
	    	    }
	    	  
	    	  
	    	};
	    	
	    //2:Functional Interface 
	    	//Comparator<Student> stud =	 (Student i, Student j)->i.age > j.age?1 :-1;
	    	//Comparator<Student> stud =	 ( i, j)->i.age > j.age?1 :-1;
	    	
	    	
	    	
		
		 List<Student> studs= new ArrayList<>();
		 
		 studs.add(new Student(21 , "Navin"));
		 studs.add(new Student(12 , "John"));
		 studs.add(new Student(18 , "Parul"));
		 studs.add(new Student(20 , "Kiran"));
		 
		 
		 
		 //sort value based on their  age 
		 
		  Collections.sort(studs , stud);
		 
		 //
		 for(Student s : studs )
			 System.out.println(s);
				
	}

}
