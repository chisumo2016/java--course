package stack;

import java.util.Stack;

/**
 * stack LIFO data structure .Last-In-First-Out
    store objects into a sort of "vertical tower"
    push() to add an item to the top of the stack
    pop() to remove an item from the top of the stack
 */
public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();



        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("ffVII");

        //remove the item from the top
        /*stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();*/

        String myFavoriteGame = stack.pop();


        //Take something
        System.out.println(stack.peek());

        //printing the stack without removing them
       // System.out.println(stack);
        System.out.println(myFavoriteGame);

    }
}
