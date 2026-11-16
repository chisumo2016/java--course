package oops.staticKeyWord;

public class Friend {

    String name;
   static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static  void ShowFriends(){
        System.out.println("You have  " + numOfFriends + " friends"); // object on the same class , we dont use this.
    }
}
