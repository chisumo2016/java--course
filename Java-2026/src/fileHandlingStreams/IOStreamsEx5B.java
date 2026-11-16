package fileHandlingStreams;

import java.io.*;

//Generalize socket , file bytes  , all subclasses must imolement
class IOUtilsB{
    public static  void copy(OutputStream out , InputStream in) throws IOException{
        byte[] buffer = new byte[1024];
        int n ;

        while((n = in.read(buffer)) != -1) { // value btye by byte
            out.write(buffer, 0, n);
        }
    }
}
public class IOStreamsEx5B {

    public static void main(String[] args) throws IOException {
        File basePath = new File("/Users/developer/Documents/java/Java-2026");

        File sourceFile      = new File(basePath, "src.txt");
        File destinationFile = new File(basePath, "dest.txt");

        //Read
        FileInputStream fileIn = new FileInputStream(sourceFile);

        //write/ Destination

        //2nd Way, this will close the resource
        try( FileOutputStream fileOut = new FileOutputStream(destinationFile);) {

            IOUtilsB.copy(fileOut, fileIn); //assume IOException

            System.out.println("copied......");
        }
    }
}
