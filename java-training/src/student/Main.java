package student;
import java.util.Scanner;

public class Main {

   public static  void main(String[] args) {
     Scanner s = new Scanner(System.in);

       cars car1 = new cars();
       cars car2 = new cars();
       cars car3 = new cars();
       cars car4 = new cars();
       cars car5 = new cars();

       bikes b1 = new bikes();
       bikes b2 = new bikes();
       bikes b3 = new bikes();
       bikes b4 = new bikes();
       bikes b5 = new bikes();

       car1.name = "Lamborghini";
       car2.name = "Ferrari";
       car3.name = "Bugatti";
       car4.name = "Aston Martin";
       car5.name = "McLaren";

       b1.name = "Harley Davidson";
       b2.name = "Kawasaki";
       b3.name = "Ducati";
       b4.name = "Yamaha";
       b5.name = "Suzuki";

       b1.cost = "$130,000";
       b2.cost = "$232,000";
       b3.cost = "$200,000";
       b4.cost = "$300,000";
       b5.cost = "$500,000";

       car1.cost = "$203,000";
       car2.cost = "$252,000";
       car3.cost = "$3,000,000";
       car4.cost = "$14500,000";
       car5.cost = "$293,000";

       System.out.println("what do you want to buy");
       System.out.println("1. Bikes ");
       System.out.println("2. Cars ");

       int choice ;
       System.out.println("Enter your choice :");
       choice = s.nextInt();
       if (choice == 1) {
           System.out.println("We  have 5 models : ");
           System.out.println("1 .Harley Davidson ");
           System.out.println("2 .Kawasaki ");
           System.out.println("3 .Ducati ");
           System.out.println("4 .Yamaha ");
           System.out.println("5 .Suzuki ");
           System.out.println("Enter your choice");
           int n;
           n=s.nextInt();
           if (n==1)
           {
               System.out.println("The cost of  Harley Davidson " + b1.cost);
           } else if (n==2) {
               System.out.println("The cost of Kawasaki " + b2.cost);
           }else if (n==3) {
               System.out.println("The cost of Ducati " + b3.cost);
           }else if (n==4) {
               System.out.println("The cost of Yamaha " + b4.cost);
           }else if (n==5) {
               System.out.println("The cost of Suzuki " + b5.cost);
           }else{
               System.out.println("Please enter the value between 1-5");
           }

       } else if (choice == 2) {
           System.out.println("We have models available :");
           System.out.println("1. Lamborghini ");
           System.out.println("2. Ferrari ");
           System.out.println("3. Bugatti ");
           System.out.println("4. Aston Martin ");
           System.out.println("5. McLaren ");
           System.out.println("Enter the choice :");
           int c;
           c=s.nextInt();
           if (c==1){
               System.out.println( "The cost of Lamborghini " + car1.cost);
           } else if (c == 2) {
               System.out.println( "The cost of Ferrari " + car2.cost);
           } else if (c == 3) {
               System.out.println( "The cost of Bugatti " + car3.cost);
           } else if (c == 4) {
               System.out.println( "The cost of Aston Martin " + car4.cost);
           } else if (c == 5) {
               System.out.println( "The cost of McLaren " + car5.cost);
           }else{
               System.out.println("Please enter the value between 1-5");
           }
       }
       else {
           System.out.println("Please enter the choice between 1-2");
       }

   }
}


