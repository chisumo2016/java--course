package heap;

//Heap
	class Calculator{
		
		
		int num = 6; // instance variable 
		
		public int  add(int n1 , int n2) { // Local variable
			
			System.out.println(num);
			return  n1 + n2 ;
			
			
		}
	}

	public class Demo {
		
		public static void main(String[] args) {
			int data = 10;
			
		
			Calculator obj = new Calculator();
			Calculator obj1 = new Calculator();
			
			int result = obj.add(3 , 4);
			
			System.out.println(result);
			
			
			obj.num = 8;
			
			
			System.out.println(obj.num);
			System.out.println(obj1.num);
		}

	}



