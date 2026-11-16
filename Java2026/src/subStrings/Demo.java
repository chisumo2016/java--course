package subStrings;

import java.util.Scanner;

public class Demo {

        public static void main(String[] args) {
            //Accept the user input
            Scanner  scanner = new Scanner(System.in);



            /*
            String email    = "Bro123@gmail.com";
            String userName = email.substring(0, email.indexOf("@"));//email.indexOf("@") ,(0, 6
            String domain = email.substring(email.indexOf("@") +  1); //email.length()
            */
            String email;
            String userName;
            String domain ;

            System.out.print("Enter your email : ");

            email = scanner.nextLine();

            if (email.contains("@")){
                userName = email.substring(0, email.indexOf("@"));
                domain   = email.substring(email.indexOf("@") +  1);

                System.out.println(userName);
                System.out.println(domain);

            }else {
                System.out.println("Email must contain @");
            }

            scanner.close();

        }

}
