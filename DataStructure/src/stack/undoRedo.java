package stack;

import java.util.Stack;

/**
   uses of Stack
        1 . undo redo feature in text editors
        2 . moving  back/forwatd through browser history
        3 . Backtracking algorithms (maze , file directory)
        4 . calling functions (call stack)
 */
public class undoRedo {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();



        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("ffVII");


    }

}
