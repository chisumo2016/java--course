package fileHandlingStreams;

import java.io.File;
import java.io.IOException;

/*
    File  Management Class
        Allows us to access the metadata of a file or directory.

        Example of metadata
         File f = new File("a.txt");
         int length = f.length();
    -
 */
public class IOStreamsEx1 {
    public static void main(String[] args) throws IOException {

        // extract file metadata but not create an object
        File basePath = new File("/Users/developer/Documents/java/Java-2026");//directory
        System.out.println("isDirectory: " + basePath.isDirectory());

        File f = new File(basePath, "a.txt");// file


        //what is the last modified date of the file
        System.out.println("Last modified date: " + f.lastModified());

        //create file
        f.createNewFile();

        //leghth of the file

        System.out.println(f.getName() + " File length: " + f.length());

        File f2 = new File(basePath, "b.txt");
        if(f2.isFile()) //exists()
            System.out.println(f2.getName() +  "File exists");
        else
            System.out.println(f2.getName() +" File does not exist");
    }
}
