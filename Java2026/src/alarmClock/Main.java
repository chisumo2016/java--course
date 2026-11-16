package alarmClock;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * JAVA ALARM CLOCK
 */
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null ;
        String filePath = "/Users/developer/Documents/java/Java2026/src/alarmClock/baby_crying.wav";


        while(alarmTime == null){

            try {
                System.out.print("Enter an alarm time in HH:MM:SS format : ");
                String InputTime = scanner.nextLine();

                alarmTime = LocalTime.parse(InputTime, formatter);
                System.out.println("Alarm set for " + alarmTime);

            }catch(DateTimeParseException e){
                System.out.println("Invalid time format. Please enter time in HH:MM:SS format.");
                return;
            }

        }

        //Alarm clock object

        AlarmClock alarmClock = new AlarmClock(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);

        alarmThread.start();

        //scanner.close();
    }
}
