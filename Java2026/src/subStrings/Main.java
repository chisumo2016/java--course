package subStrings;

/*
 * substrings () = A method used to extract a portion of a string
      string.substring(startIndex, endIndex)
 */
public class Main {

    public static void main(String[] args) {
         String email    = "Bro123@gmail.com";
         String userName = email.substring(0, email.indexOf("@"));//email.indexOf("@") ,(0, 6
        String domain = email.substring(email.indexOf("@") +  1); //email.length()

        System.out.println(domain);
    }
}
