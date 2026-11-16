package oops.GettterSetter;

public class Car {

    private String color;
    private final  String model;
    private int price;

    Car(String color , String model , int price){
        this.color = color;
        this.model = model;
        this.price = price;
    }

    String getModel(){
       return this.model;
    }

    String getColor(){
        return this.color;
    }

    String getPrice(){
        return "$" + this.price;
    }



    void setPrice(int price){
        if (price < 0){
            System.out.println("Price cannot be less than zero");
        }else{
            this.price = price;
        }

    }

    void setColor(String color){
        this.color = color;
    }

}
