package controlFlow;

public class nestedIf {

    public static void main(String[] args) {

         boolean isStudent = true;
         boolean isSenior =true;
         double price = 9.99;

         if(isStudent){

             if (isSenior){
                 System.out.println("senior discount applied of %20");

                 System.out.println("Student discount applied of %10");

                 price *= 0.7;  //price = price * 0.9;

             }else {
                 System.out.println("Student discount applied of 10%");
                 price *= 0.9;  //price = price * 0.9;
             }

         }else {

             if (isSenior) {
                 System.out.println("senior discount applied of %20");
                 price *= 0.8;
             }
         }
        //System.out.println("The price of a ticket is $" + price);
        System.out.printf("The price of a ticket is $%.2f" , price);

    }
}
