package fileHandlingStreams;


import java.io.*;

/**
  DataInputStream and DataOutputStream classes to provide the additional functionality of reading and writing primitive data types
     e.g. int, float, double, boolean, char, short, long, byte
 */
public class IOStreamsEx7 {
    public static  void main(String[] args) throws IOException {

        FileOutputStream fileOut =  new FileOutputStream("output.txt"); //BYTES

        int a = 9870; // cross the byte range
        float b = 123.45f;
        DataOutputStream dout = new DataOutputStream(fileOut);

        //disc - u write son1 then song 2
        dout.writeInt(a);
        dout.writeFloat(b);
        //fileOut.write(a);


        fileOut.close();
        FileInputStream fileIn = new FileInputStream("output.txt");
        DataInputStream dIn = new DataInputStream(fileIn); //adding new feature to the object without modifying the object

        int x = dIn.readInt();
        float y = dIn.readFloat();
        //int b = fileIn.read();

        System.out.println(x + " " + y);

        fileIn.close();


    }
}
