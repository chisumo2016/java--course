package fileHandlingStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
    BufferedInputStream and  BufferedOutputStream

    They decorate the InputStream and OutputStream instances to added buffered I/O functionality.

      program <------->Buffer(tank)<------> Disc
        installing the content inside the memory buffer.
        The buffer is used to store data temporarily before it is written to the disc.
        Writing the content from the buffer to the disc is called flushing.Send the information to the disc once it is full.
        When the buffer is full, it is flushed, and the data is written to the disc.
          eg facebook
 */
public class IOStreamsEx6 {

    public static void main(String[] args) throws Exception {

        FileOutputStream fileOut = new FileOutputStream("S.txt");
        BufferedOutputStream bufferedOut = new BufferedOutputStream(fileOut); // decorator

        fileOut.write(65);
        fileOut.write(20);
        bufferedOut.flush();
        fileOut.close();

        FileInputStream fileIn = new FileInputStream("S.txt");
        BufferedInputStream bufferedIn = new BufferedInputStream(fileIn); //read

        int a = bufferedIn.read();
        int b = bufferedIn.read();
        System.out.println(a);
        System.out.println(b);
        fileIn.close();

    }
}
