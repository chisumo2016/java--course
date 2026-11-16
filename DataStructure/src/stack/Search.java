package stack;

import java.util.Stack;

public class Search {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();



        stack.push("Minecraft");//5 top
        stack.push("Skyrim");//4 top
        stack.push("DOOM");//3 top
        stack.push("Borderlands");//2 top
        stack.push("ffVII"); //1 top

        //System.out.println(stack.search("DOOM"));

        for(int i = 0; i < 1000000000; i++) {
            stack.push("fallout");
        }

    }
}
