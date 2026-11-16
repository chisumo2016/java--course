package staticMember;
/*
    Static Members
         Shared by all objects of the class
         No need for objects
          static can only access  .... other static members directly

          Non static members belong to the object(student)
          Non static members can access static members directly

         access
             stundent.board();

        purpose and the use ?
*/

class Student{

    //static member - they belongs to class
    // class member
    private static String board;

    public static void writeToBoard(String s){
        board = s;
       // note = "written to board";
    }

    //non-static/instance member - related to object(student)
    private  String note;

    public void writeNote(String s){  //set
       note = s;
    }

    public  void  print(){
        System.out.println("Content on the board " + board);
        System.out.println("My notes -" + note);
    }
}
public class Main {

    public static void main(String[] args) {
        Student s1 , s2;
        s1 = new Student();
        s2 = new Student();


        s1.writeToBoard("written by s1 ");
        s1.writeNote("Tanzania");

        s2.writeToBoard("written by s2 ");
        s2.writeNote("Tanzania");

        s2.print();
        s1.print();

        Student.writeToBoard("written to board");
    }
}
