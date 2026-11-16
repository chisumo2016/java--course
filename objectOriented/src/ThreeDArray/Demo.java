package ThreeDArray;


// 3D Arrays
public class Demo {

	public static void main(String[] args) {
		int nums[][][] = new int[3][4][5];  // Three Dimensiona
		nums[0] = new int[3];
		nums[1] = new int[4];
		nums[2] = new int[2];
		
		
		
		for(int i=0; i<nums.length; i++) {
			//inner Loop
			for(int j=0; j<nums[i].length; j++) {
				
				
				//Assign the value
				nums[i][j]=  (int) (Math.random() * 100);
				
				
			}
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
