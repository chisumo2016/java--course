package TwoDArrays;
/*
  2D
     NAME[ROW][COLUMN]
 */
public class Demo {

    public static void main(String[] args) {

        String[][] groceryList = {
                    {"apple", "banana", "orange"},  // row 0 col 0
                    {"carrot", "broccoli", "spinach"}, // row 1 col 0
                    {"beef", "chicken", "pork"}  // row 2 col 1
                };

        // Change
        //groceryList[0][0] = "Pineapp;e";
        groceryList[1][2] = "celery";

        for (String[] foods : groceryList) {

            for (String food : foods) {
                System.out.print(food + " ");
            }

            System.out.println();
        }
    }
}
