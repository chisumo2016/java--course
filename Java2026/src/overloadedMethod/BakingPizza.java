package overloadedMethod;

public class BakingPizza {

    public static void main(String[] args) {

        String pizza = bakePizza("flat bread", "Mozzarella", "pepperoni");

        System.out.println(pizza);
    }

    static String bakePizza(String bread){
        return bread + "pizza";
    }

    static String bakePizza(String bread, String cheeze){
        return cheeze + " " + bread + "pizza";
    }


    static String bakePizza(String bread, String cheeze, String topping){
        return topping + " " + cheeze + " " + bread + "pizza";
    }
}
