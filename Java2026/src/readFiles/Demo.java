package readFiles;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
    How to read a file using Java (3 Popular Options)
     1: BufferedReader + FileReader : Best for reading text files line by line.
     2: FileInputStream  : Best for binary files(eg images, videos, etc.)
     3: RandomAccessFile : Best for read/write specific portions of a large file.
 */

public class Demo {

        public static void main(String[] args) {

                final String filePath = "example.txt";

                try(BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                        //System.out.println("That file exists.");
                        String line;

                        while ((line = br.readLine()) != null) {

                                System.out.println(line); // will strinf
                        }
                }

                catch (FileNotFoundException e) {

                        System.out.println("Could not find the file.");
                }
                catch (IOException e) {

                        System.out.println("An error occurred while reading the file.");
                }
        }
}
