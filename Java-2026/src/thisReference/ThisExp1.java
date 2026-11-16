package thisReference;
/*
    this - refers to current object

    A reference variable that points to the current object on which the operation is performed .

    USAGES:
         1) Resolving local and instance variables references
         2) Constructor invocation from another constructor of the same class
         3) Referencing/returning current object from with in the methods
 */

class Sample{
    private  int x ;

    public void setX(int x){
       this.x = x ;
    }

    public int getX(){

        return this.x ;
    }

    public Sample getRef(){
        return this ;
    }
}
public class ThisExp1 {

    public static void main(String[] args) {

        Sample s1 , s2 ;

        s1 = new Sample() ;
        s1.setX(10) ;
        System.out.println(s1.getX()) ;

        s2 = s1.getRef() ; // what is this ? refrence to the same object
        System.out.println(s2.getX()) ;
    }
}
