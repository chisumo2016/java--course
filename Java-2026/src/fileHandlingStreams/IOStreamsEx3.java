package fileHandlingStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    WHAT IF THE FILE IS MORE
   FileInputStream - for reading the content from a file
       int read() - reads a single byte from the file,
                    reads 1 byte and returns it, -1 if it is EOF
       int read (byte[] buffer) - reads into buffer and returns the number of bytes read .


   FileOutStream - for writing the content for a file.(Overwrites the entire file)
       write(int) - writes 1 byte i.e., the last byte of the given value.
       write (byte [] buffer) - writes the entire buffer.
       write (byte [] buffer, int start, int n) - writes n bytes from the given start index.
 */
public class IOStreamsEx3 {

    public static void main(String[] args) throws IOException {
        File basePath = new File("/Users/developer/Documents/java/Java-2026");

        File sourceFile      = new File(basePath, "src.txt");
        File destinationFile = new File(basePath, "dest.txt");

        //Read
        FileInputStream fileIn = new FileInputStream(sourceFile);

        //write/ Destination
        FileOutputStream fileOut = new FileOutputStream(destinationFile);


        int value ;
        while((value = fileIn.read()) != -1) { // value btye by byte
            fileOut.write(value);
        }

        System.out.println("copied......");

        fileIn.close();
        fileOut.close();

    }
}
/*
    src 1028 byts

    1 read -> 1024 bytes- write
    2 read -> 4 bytes-

 */
