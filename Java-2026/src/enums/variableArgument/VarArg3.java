package enums.variableArgument;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class VarArg3 {

    public static void main(String[] args) {
        Collection<String> col1 = MyCollectionListOfValue.of("a", "b", "cd");
        System.out.println(col1);

        System.out.println();

        Collection<Integer> col2 = MyCollectionListOfValue.of(1, 2, 3);
        System.out.println(col2);

        List<Integer> col3 = Arrays.asList(50, 29, 34);
        System.out.println(col3);
    }
}

class MyCollectionListOfValue{

    public static <T > Collection<T> of(T... values){ //anytime of value
        Collection<T> col = new ArrayList<>();

        for(T value : values){
            col.add(value);
        }
        return col;
    }
}
