package anonymousClasses;
/*
  Anonymous class: A class that doesn't have a name .Cannot be reused.
                    Add custom behavior without having to create a new class.
                    Often used for time uses (TimerTask, Runnable, callbacks)
 */
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();

        //Anonymous class
        Dog dog2 = new Dog(){
            /*Define the behavior*/
           @Override
           public void speak(){
               System.out.println("Scooby Doo says *Ruh Roh*");
           }
        };


        dog.speak();
        dog2.speak();
        //TalkingDog talkingDog = new TalkingDog();
        //talkingDog.speak();
    }
}
