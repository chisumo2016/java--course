package printf;
/*
    [flags]
    + = output a plus
    , = comma grouping separator
    ( = negative numbers are enclosed in parentheses ()
    space = display  in minus if negative , space if postive
*/
public class flags {

    public static void main(String[] args) {

        double price = 9.99 ;//9000.99;
        double price2 = 100.15; //100000.15;
        double price3 = -54.01; //-54000.01;

        System.out.printf("%+.2f\n", price);
        System.out.printf("%+.2f\n", price2);
        System.out.printf("%+.2f\n", price3);

        System.out.printf("%,.2f\n", price);
        System.out.printf("%,.2f\n", price2);
        System.out.printf("%+,.2f\n", price3);

        System.out.printf("%(.2f\n", price);
        System.out.printf("%(.2f\n", price2);
        System.out.printf("%(.2f\n", price3);

        System.out.printf("% .2f\n", price);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

    }
}
