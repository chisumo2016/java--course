package polymorphism;

public class Dog  extends AnimalSound {
	
	public void Sound() {
		System.out.println("The dog says: bark bark");
	}
	
	public void Sound(String angry) {  //method overloading
		System.out.println("The dog says: growl growl");
		super.Sound(); //supper
	}
	
	
	

}
