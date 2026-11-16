package Encapsulation;


//encapsulation - Bind of data 

class Human
{
	//instance variable
//	private int age = 11;
//	private String name = "doe";
	
	private int age;
	private String name ;
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a)
	{
		age = a;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String n)
	{
		name =  n;
	}
	
	
	
}


public class Demo {

	public static void main(String[] args) {
		
		Human obj = new Human();
		
		//assign the value with help of method
		obj.setAge (30);
		obj.setName  ("Suji");
		
		//Getting the value with help of method
		System.out.println(obj.getName() + " : " + obj.getAge());
		
		
	}

}
