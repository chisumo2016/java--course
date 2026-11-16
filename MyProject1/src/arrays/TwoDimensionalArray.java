package arrays;

public class TwoDimensionalArray {
	
	public static void main() {
		
		int arr[][] = {
				
				{2 , 7 , 9 } ,  // {} represent the rows
				{3 , 6 , 1 } ,  // 3 , 6 , 1 represent column
				{7 , 4 , 2 } ,		
		};
		
		//For matrix calculation (2x2) / row x column
		for(int i = 0 ; i < 3  ; i++) {
			for(int j=0; j <3  ; j++) {
				//printing 2D
				System.out.print(arr[i][j] + " ");
			}
			
			System.out.println();
		}
		
		System.out.println(arr[0][1]);
		System.out.println(arr[1][1]);
		System.out.println(arr[2][1]);
		System.out.println(arr[0][2]);
	}

}
