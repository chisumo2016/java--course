package constructorOverloading;


/* Default vs Parameterized Constructor in Java **/
class Human
{

	private int age; // instance variable
	private String name ;
	
	
	//Constructor - has same name as class name , never return anything
	public Human()//default constructor
	{
		/**Assign value*/
		age = 12 ;
		name ="Jon doe";
		
		//System.out.println("in constructor");
	}
	
	//Constructor overloading //parameterised constructor
	public Human(int a , String n)
	{
		/**Assign value*/
		this.age = a ;
		this.name = n;
		
		
	}
	
	//Constructor overloading //parameterised constructor
		public Human(String name)
		{
			/**Assign value*/
			this.age = 12 ;
			this.name = name;
			
			
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
		
		Human obj  = new Human();
		Human obj1 = new Human(46 , "Lucy");
		
		System.out.println(obj.getName() + " : " + obj.getAge());
		System.out.println(obj1.getName() + " : " + obj1.getAge());
		
		//assign the value with help of method
		//obj.setAge (30);
		//obj.setName  ("John Done");
		
		//Getting the value with help of method
		//System.out.println(obj.getName() + " : " + obj.getAge());
		
		
	}


}

