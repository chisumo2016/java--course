package InnerClas;


/**Abstract and Anonymous Inner **/
abstract class A
{
	abstract public void show();
	abstract public void config();
	
}

class B extends A
{
	 public void show()
	 {
		 System.out.println("in B show");
	 }
}



public class Demo {

	public static void main(String[] args) {
		
	   A obj = new A() 
	   
	   // Anonymous CLASS
	   {
		   public void show()
			 {
				 System.out.println("in NEW show");
			 }
		   
		   public void config()
			 {
				 System.out.println("in NEW Conf");
			 }
	   };
	  obj.show();
	}

}


