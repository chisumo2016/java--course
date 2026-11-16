package objectSerializationDeserialization;

import java.io.*;

/*
    ObjectInputStream and ObjectOutputStream are used to serialize and deserialize objects. eg file or network

    They decorate the InputStream and OutputStream classes  to provide  the additional functionality of reading and writing objects.

    The corresponding class should implement Serializable interface.

     Object (Called Serialization _  ----> jdk --------> external machine (Called Deserialization )
                                           Json
                                           XML
       JDK
    1) Serialization   - converting object to stream of bytes.
    2) Deserialization - converting stream of bytes to object.
 */
public class IOStreamsEx8 {
    public static void main(String[] args) throws Exception {
        Rectangle rect1 = new Rectangle(10, 20);
        Rectangle rect2 = new Rectangle(20, 60);

        //Write into file
        FileOutputStream fileOutputStream = new FileOutputStream("rectangles.dat");//.dat is binary
        ObjectOutputStream object = new ObjectOutputStream(fileOutputStream);

        object.writeObject(rect1);
        object.writeObject(rect2);
        fileOutputStream.close();


        //Reading from file
        FileInputStream fileInputStream = new FileInputStream("rectangles.dat");//write bytes to file
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Rectangle rect3 = (Rectangle) objectInputStream.readObject();
        Rectangle rect4 = (Rectangle) objectInputStream.readObject();


        rect3.display();
        rect4.display();

        objectInputStream.close();
    }
}

class Rectangle implements Serializable{ //Serializable is marker interface
    private double length;
    private double width;
    private  transient Double area; // transient variable are excluded from serialization

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = this.length * this.width;
    }

    public  double getArea() {
        if (area == null){
            area = length * width;
        }
        return area;
    }

    public  void display() {
        System.out.println(" Length: " + length + " Width: "  + width + " Area: "  + getArea());

    }
}
