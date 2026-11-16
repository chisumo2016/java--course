package StaticBlock;

//static block

class Mobile
{
	//Instance variable
	String brand;
	int price;
	
	//static  variable
	static String name;
	
	
	
	//constructor
	public Mobile()
	{
		brand ="";
		price = 200;
		System.out.println("In constructor");
	}
	
	//static block; - called one ,instantiate the name variable
	
		static 
		{
			name = "Phone";
			
			System.out.println("In static block");
		}
		
	
	
	public void show()
	{
		System.out.println(brand + " : " + price+ " : " +name);
	}
	
	
}


public class Demo {

	public static void main(String[] args) throws ClassNotFoundException{
		
		Class.forName("Mobile");
		
//		Mobile obj1 = new Mobile();
//		obj1.brand = "Apple";
//		obj1.price = 1500;
//		
//		 //Access the static name via class name not object
//		Mobile.name = "SmartPhone";
//		
//		Mobile obj2 = new Mobile();
		
		
	}

}

