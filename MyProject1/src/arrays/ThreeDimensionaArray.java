package arrays;

public class ThreeDimensionaArray {
	
	public static void main() {
		
		//Multi Dimensional  array - {X , Y , Z}
		
		int[][][] arr = {
				
				{ {1 , 2 , 10} , {3 , 4 , 11}},// 
				{ {5, 6 , 12 } , {7 , 8 , 13}},
		};
		
		System.out.println(arr[0][1][2]);
		System.out.println(arr[1][1][2]);
	}

}


//   { {1 , 2 , 10} , {3 , 4 , 11}} ------  X axis
//   { {5, 6 , 12 } , {7 , 8 , 13}}, ------  X axis
//   {1 , 2 , 10}, ------    Y axis
//   1 , 2 , 10, ------      Z axis

      // [X axis] [Y axis] [Z axis]