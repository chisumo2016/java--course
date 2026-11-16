package musicPlayer;

import javax.sound.sampled.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

/**
 * A music player
 *    How to play music with Java (.wav , .au , .aiff)
 *    https://cloudconvert.com/mp3-to-wav
 */
public class Main {

    public static  void main() {
        String filePath = "/Users/developer/Documents/java/Java2026/src/musicPlayer/baby_crying.wav";

        Path path = Path.of(filePath);

        System.out.println("Absolute path: " + path.toAbsolutePath());
        System.out.println("File exists: " + Files.exists(path));

        // File Object
        File file = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)) {

            Scanner scanner = new Scanner(System.in);


            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            //clip.start();

            String response =  "";

            while(!response.equals("Q")){

                System.out.println("P = Play");
                System.out.println("S = Stop ");
                System.out.println("R = Reset ");
                System.out.println("Q = Quit ");
                System.out.print("Enter your choice: ");

                response = scanner.next().toUpperCase();

                //System.out.println("No problems detected");

                switch (response){

                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();

                    default -> System.out.println("Invalid choice");
                }
            }
        }

        catch (FileNotFoundException e) {

            System.out.println("Could not locate file ");
        }

        catch (UnsupportedAudioFileException e){
            System.out.println("Audio file is not supported");
        }

        catch (LineUnavailableException e) {

            System.out.println("Line unavailable");
        }

        catch (IOException e) {

            System.out.println("Something went wrong");
        }

        finally {
            System.out.println("Bye");

            //scanner.close();
        }
    }
}
