package constructorsInheritance;
/*
   Base class constructor invocation using super()
     - Should be the first statement in the derived class / subclass constructor
     - If not selected by default super() is selected\

     Protected members can be accessed by the derived class /subclass
 */

class Point2D{
    protected int x , y ;  // gettter and setter 2) protected

    //public Point2D(){}  // ASSUMING U DISABLE THIS
    public Point2D(int x , int y ){
        this.x = x ;
        this.y = y ;
    }

    public void print(){
        System.out.printf("(%d,%d) \n",x,y);
        //System.out.println("Point2D : (" + x + "," + y + ")");
    }
}

class Point3D extends  Point2D{
    private  int z ;

    public Point3D(){
        super(0,0);  // PASS THE VALUE FROM BASE
    }
    public Point3D(int x , int y , int z){
        super(x,y); // super() should be the first statement in the derived class / subclass constructor
        this.z = z ;
    }

    @Override
    public void print(){
        System.out.printf("(%d, %d, %d) \n",x,y,z);
        //System.out.println("Point2D : (" + x + "," + y + ")");
    }
}
public class InheritanceEx1 {
    public static void main(String[] args){

        Point2D p2d = new Point2D(10,20);
        p2d.print();

        System.out.println();

        Point3D p3d = new Point3D(10,20,30);
        p3d.print();

    }
}
