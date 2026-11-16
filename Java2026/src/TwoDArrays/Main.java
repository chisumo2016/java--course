package TwoDArrays;
/*
 * 2d arrays - An array where each element is an array.
 *       Useful for storing a matrix of data
 */
public class Main {

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "orange"};
        String[] vegetables = {"carrot", "broccoli", "spinach"};
        String[] meats = {"beef", "chicken", "pork"};

        String[][] groceryList = { fruits, vegetables, meats};

         for (String[] foods : groceryList) {

            for (String food : foods) {
                System.out.print(food + " ");
            }

             System.out.println();
        }

    }
}
