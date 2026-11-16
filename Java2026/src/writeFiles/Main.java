package writeFiles;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/*
    How to write a file using Java (4 popular options)

    1: Using FileWriter : Good for small  or medium sized  text files
    2: Using BufferedWriter : Better performance for large amounts of text
    3: Using FileOutputStream : Best for binary files (eg images , audio files)
    4: PrintWriter: Best for structured data, like reports or logs

            """
            """
*/
public class Main {

    public static void main(String[] args) {

        String filePath = "example.txt";
        String textToWrite ="""
                o perhaps, you've generated some fancy text, and you're content that you can now copy and paste your fancy text in the comments section of funny cat videos, but perhaps you're wondering how it's even possible to change the font of your text? Is it some sort of hack? Are you copying and pasting an actual font?
                           Well, the answer is actually no - rather than generating fancy fonts, this converter creates fancy symbols. The explanation starts with unicode; an industry standard which creates the specification for thousands of different symbols and characters. All the characters that you see on your electronic devices, and printed in books, are likely specified by the unicode standard.
                                 """;

        try (FileWriter fileWriter = new FileWriter(filePath )) {  //u can use absolute path

            fileWriter.write(textToWrite);
            System.out.println("File has been written");

        }
        catch (FileNotFoundException e) {

            System.out.println("File not found");
        }

        catch (IOException e) {

            System.out.println("Could not write file ");

        }
    }
}
