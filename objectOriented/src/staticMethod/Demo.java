package staticMethod;



//static method - common for all object
class Mobile
{
	//Instance variable
	String brand;
	int price;
	static String name;
	
	public void show()
	{
		System.out.println(brand + " : " + price+ " : " +name);
	}
	
	//Static method
	public static void show1(Mobile obj)
	{
		System.out.println(obj.brand + " : " + obj.price+ " : " +name);
	}
}


public class Demo {

	public static void main(String[] args) {
		Mobile obj1 = new Mobile();
		obj1.brand = "Apple";
		obj1.price = 1500;
		
		 //Access the static name via class name not object
		Mobile.name = "SmartPhone";
		
		Mobile.name = "Phone";
		
		Mobile obj2 = new Mobile();
		obj2.brand = "Sumsung";
		obj2.price = 1500;
		Mobile.name = "SmartPhone";
		
		obj1.show();
		obj2.show();
		
		// Call static method with help of class name
		
		Mobile.show1(obj1);

	}

}
