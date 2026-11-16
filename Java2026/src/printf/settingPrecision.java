package printf;

/*

   %[format_specifier][width][.precision][flags][length] 3g .1f to display one digit
 */
public class settingPrecision {

    public static void main(String[] args) {

        double price = 9.99;
        double price2 = 100.15;
        double price3 = 54.01;

        System.out.printf("% .2f\n", price);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);
    }
}
