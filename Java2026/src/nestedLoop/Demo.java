package nestedLoop;
/*
    Nested loop = A loop inside another loop
    while(1 == 1){
            while(2 ==2){
                System.out.println("Hello");
            }
        }

        used often with matrices or DS&A
 */
public class Demo {

    public static void main(String[] args) {

        for(int i = 1; i <=3; i++){

            for(int j = 1; j <= 9; j++){

                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
