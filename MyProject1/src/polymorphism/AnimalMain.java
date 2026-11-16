package polymorphism;

public class AnimalMain {
	public static void main(String[] args ) {
		
		AnimalSound animal = new AnimalSound();
		Cow cow = new Cow();
		Dog dog = new Dog();
		
		animal.Sound();
		cow.Sound();
		dog.Sound();
		dog.Sound("angry");
		
	}

}
