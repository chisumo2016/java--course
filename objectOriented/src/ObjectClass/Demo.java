package ObjectClass;


/**Object Class equals toString hashcode*/


class Laptop
{
	String model;
	int price;
	
	public String toString()
	{
		return model + " " + price;
	}
	
	public boolean equals(Laptop that)
	{
		return this.model.equals(that.model) && this.price == that.price;
	}
}


public class Demo {

	public static void main(String[] args) {
		Laptop  obj1 = new Laptop();
		obj1.model = "Lenovo Yoga";
		obj1.price = 1000;
		
		Laptop  obj2 = new Laptop();
		obj2.model = "Lenovo Yoga";
		obj2.price = 1000;
		
		System.out.println(obj1.toString());
		
		boolean result = obj1.equals(obj2);
		System.out.println(result);
		

	}

}
