package datesTimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/*
   How to work with DATES and TIMES using Java
    (LocalDate, LocalDateTime, LocalTime, UTC timestamp)
 */
public class Main {

    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println();

        LocalTime time = LocalTime.now();
        System.out.println(time);
        System.out.println();

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println();

        Instant instant = Instant.now();
        System.out.println(instant);
        System.out.println();

        //Custom format
        //https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

        LocalDateTime dateTime2 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss"); //"yyyy-MM-dd HH:mm:ss"
        System.out.println(dateTime2.format(formatter));
        System.out.println();

        //2
        LocalDateTime dateTime3 = LocalDateTime.now();

        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss"); //"yyyy-MM-dd HH:mm:ss"
        String newDateTime = dateTime3.format(formatter2);
        System.out.println(newDateTime);
        System.out.println();

        //Custom date object

        LocalDate date2 = LocalDate.of(2025, 12, 25);
        System.out.println(date2);
        System.out.println();

        // Hours , Minutes , Seconds
        LocalDateTime dateTime4 = LocalDateTime.of(2026, 12, 25, 12, 0, 0);
        System.out.println(dateTime4);
        System.out.println();

        //compare date
        LocalDateTime dateTime5 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime dateTime6 = LocalDateTime.of(2025, 01, 01, 0, 0, 0);
        //System.out.println(dateTime6.isAfter(dateTime5));
        if (dateTime5.isBefore(dateTime6)){
            System.out.println(dateTime5 + " is earlier than " + dateTime6);
        } else if (dateTime5.isAfter(dateTime6)) {
            System.out.println(dateTime5 + " is later than " + dateTime6);
        } else if (dateTime5.isEqual(dateTime6)) {
            System.out.println(dateTime5 + " is equal than " + dateTime6);
        }
        System.out.println();
    }
}
