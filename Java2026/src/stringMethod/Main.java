package stringMethod;

import java.util.Locale;

/***
 * String methods in Java
 */
public class Main {

    public static void main(String[] args) {

         String name = "John Doe      ";

         int length = name.length();
         char letter = name.charAt(0); // index start 0
         int index = name.indexOf("o");
         int lastIndex = name.lastIndexOf("o");

         name = name.toUpperCase();
         name = name.toLowerCase();
         name = name.trim();
         name = name.replace("O", "o");

         if (name.isEmpty()){
             System.out.println("Your name us empty");
         }else{
             System.out.println("hello" + name);
         }

         if (name.contains("  ")){
             System.out.println("Your name contains space");
         }else{
             System.out.println("Your name does not contain space");
         }

         if (name.equals("password")){
             System.out.println("Your name can't be password");
         }else{
             System.out.println("Heloo" + name);
         }

        if (name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
        }else{
            System.out.println("Heloo" + name);
        }

         System.out.println("Length of name: " + length);
         System.out.println("First letter of name: " + letter);
         System.out.println("Index of 'o': " + index);
         System.out.println("Last index of 'o': " + lastIndex);
         System.out.println("Name in uppercase: " + name);
         System.out.println("Name in lowercase: " + name.toLowerCase());
         System.out.println("Name trimmed: " + name.trim());
         System.out.println("Name trimmed and in lowercase: " + name.trim().toLowerCase());
         System.out.println("Name trimmed and in uppercase: " + name.trim().toUpperCase());
    }
}
