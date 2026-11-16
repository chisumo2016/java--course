package encapsulation2;

public class Main {
	
	public static void main() {
		Car c = new Car("BMW" , "$30 000" , "200kmph");
		
		System.out.println(" Name: " + c.getName() + "  Price : " +c.getPrice() + " Top Speed : " +c.getTopSpeed());
		
		
		System.out.println("Stats after updation");
		
		//Manipulate the value 
		
		c.setPrice("$50 0000");
		c.setTopSpeed("300kmph");
		
		System.out.println(" Name: " + c.getName() + "  Price : " +c.getPrice() + " Top Speed : " +c.getTopSpeed());
		
		
	}

}
