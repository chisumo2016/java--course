package contsructor;



class Human
{

	private int age; // instance variable
	private String name ;
	
	
	//Constructor - has same name as class name , never return anything
	public Human()
	{
		/**Assign value*/
		age = 12 ;
		name ="Jon doe";
		
		//System.out.println("in constructor");
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) //a is local variable
	{
		this.age = a;  // this represent current object 
	}
	
	public String getName() {
		return name;
	}
	
	//Setter
	public void setName(String n)
	{
		this.name =  n;
	}
	
	
	
}


public class Demo {

	public static void main(String[] args) {
		
		Human obj = new Human();
		
		System.out.println(obj.getName() + " : " + obj.getAge());
		
		//assign the value with help of method
		//obj.setAge (30);
		//obj.setName  ("John Done");
		
		//Getting the value with help of method
		//System.out.println(obj.getName() + " : " + obj.getAge());
		
		
	}


}
