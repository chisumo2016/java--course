package Array;

public class Demo {

	public static void main(String[] args) {
		
        int num[] = {3 , 7 , 2 , 4};
        
      //Dynamic
        int nums[] = new int[3];
        nums[0]=6;
        nums[1]=26;
        nums[2]=4;
        
        //updating the value 
        
        num[1] = 6;
        
        //Fetch value
        System.out.println(num[0]);
        
        //Fetch value
        System.out.println(nums[2]);
        
        //print/ fetch all the values
        
        for (int i=0; i<3 ; i++) {
        	System.out.println(nums[i]);
        }
       
        
	}

}
