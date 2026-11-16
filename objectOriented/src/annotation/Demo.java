package annotation;
/*What is Annotation - meta data  
 * Bugs in programming are logical  expect 2 and u get 4 . @Override - compiler will help solve in compile time
 * **/

@Deprecated
class A
{
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in A Show");
	}
}

class B extends A
{
	@Override
	public void showTheDataWhichBelongsToThisClass()
	{
		System.out.println("in B Show");
	}
}

public class Demo {

	public static void main(String[] args) {
		B obj = new B();
		obj.showTheDataWhichBelongsToThisClass();

	}

}
