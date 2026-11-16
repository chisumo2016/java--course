package enums.variableArgument;
/*
   Generic Vlaue
 */
public class VarArgsEx2 {

    static <T extends Number> double sum(T ... a){ // array , int ... a last , add any number of integer
        int s = 0;
        for(T value : a){
            s += value.doubleValue();
        }
        return s;
    }

    public static void main(String[] args) {

        System.out.println(sum(1,2));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(4,sum(6,2)));

        //double value

        System.out.println(sum(10.2,20.34,30.56,40.23));

    }
}
