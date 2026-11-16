package multiDimensionalArray;

public class Demo {

	public static void main(String[] args) {
		int nums[][] = new int[3][4];
		
		
		
		for(int i=0; i<3; i++) {
			//inner Loop
			for(int j=0; j<4; j++) {
				
				
				//Assign the value
				nums[i][j]=  (int) (Math.random() * 100);
				//System.out.print(nums[i][j]);
				
			}
		}
		
		
		//Outer Loop
		
		for(int i=0; i<3; i++) {
			//inner Loop
			for(int j=0; j<4; j++) {
				
				//print the value 
				//System.out.println(nums[i][j]);
				
				//print in the box
				System.out.print(nums[i][j] + " ");
				
			}
			System.out.println();
		}
		
		//Enhance for loop
		
		for(int n[] : nums) {
			for(int m:n) {
				System.out.print(m + " ");
			}
			
			System.out.println();
		}

	}

}
