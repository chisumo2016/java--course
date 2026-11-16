package enums.variableArgument;
/*
    Variable argument example - Framework Building
 */
public class VarArgsEx1 {

    static  int sum(int ... a){ // array , int ... a last
        int s = 0;
        for(int value : a){
             s += value;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(10,20,30,40));
        System.out.println(sum(4,sum(6,2)));

    }
}
