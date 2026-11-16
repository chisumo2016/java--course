package generics;

/**
 * <TU,U></TU,U>
 */
public class Demo {

    public static void main(String[] args) {
        //Product<String, Double> product1  = new Product<>("apple", 3.12);
        Product<String, Integer> product2 = new Product<>("ticket", 15);


        //System.out.println(product1.getItem());
        System.out.println(product2.getPrice());

    }
}
