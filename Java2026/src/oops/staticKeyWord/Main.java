package oops.staticKeyWord;

import java.sql.SQLOutput;

/*
    Static Keyword : Makes/modifies a VARIABLE or METHOD belongs to the class itself
                    rather than to any specific object
                    Commonly used for utility methods or shared data/resources among object shared in class eg
                    Math.round(3.99); numOfFriends
 */
public class Main {

    public static void main(String[] args) {
        Friend friend1 = new Friend("Alice");
        Friend friend2 = new Friend("Bob");
        Friend friend3 = new Friend("John");
        Friend friend4 = new Friend("Jsand");
        Friend friend5 = new Friend("Jerry");

        //Accessing static variable
        System.out.println(Friend.numOfFriends);

        Friend.ShowFriends();

        System.out.println();
        // Math Number, is static
        Math.round(3.99);

    }
}
