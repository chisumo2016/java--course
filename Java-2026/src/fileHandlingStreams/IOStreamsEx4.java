package fileHandlingStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOStreamsEx4 {
    public static void main(String[] args) throws IOException {
        File basePath = new File("/Users/developer/Documents/java/Java-2026");

        File sourceFile      = new File(basePath, "src.txt");
        File destinationFile = new File(basePath, "dest.txt");

        //Read
        FileInputStream fileIn = new FileInputStream(sourceFile);

        //write/ Destination
        FileOutputStream fileOut = new FileOutputStream(destinationFile);

        byte[] buffer = new byte[1024];

        int n ;
        while((n = fileIn.read(buffer)) != -1) { // value btye by byte
            fileOut.write(buffer, 0, n);
        }
        System.out.println("copied......");

        fileIn.close();
        fileOut.close();

    }
}
