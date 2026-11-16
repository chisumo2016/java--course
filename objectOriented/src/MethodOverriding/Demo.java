package MethodOverriding;

/*Method Overriding - overriding the method of parent class**/


class Calc
{
  public int add(int n1 , int n2)
  {
	  return n1 + n2;
  }
  
 
}

class Advanc extends  Calc
{
	public int add(int n1 , int n2)
	  {
		  return n1 + n2 + 1;
	  }
}

public class Demo {

	public static void main(String[] args) {
		Advanc obj = new Advanc();
		int r1 = obj.add(4, 5);
		
		System.out.println(r1);
	}

}
