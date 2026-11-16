package EnumClass;



/**
 *  Enum Class
 */

enum Laptop  //class
{
	// 0 1 2 and it object(constructor) passing the value 
	Macbook(2000) ,
	XPS(2200) ,
	Surface  ,  //assume i don't pass the price  Surface (1500)
	ThinkPad (1800)  ;
	
	
	private int price;
	
	
	//Default Constructor 
    private Laptop() {
    	
    	price = 500;
	}


	//private Constructor  , bse of the same class
	private Laptop(int price) {
		this.price = price;
		 System.out.println("in Laptop " + this.name());
	}
	
	
	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}



	
}


public class Demo {

	public static void main(String[] args) {
		
      Laptop lap = Laptop.Macbook;
      System.out.println(lap + " : " + lap.getPrice());
      
     
      
      // Get all Laptop
      for(Laptop lap1 : Laptop.values()) {
    	  
    	  System.out.println(lap1 + " : " + lap1.getPrice());
      }
     
	}
	
}
