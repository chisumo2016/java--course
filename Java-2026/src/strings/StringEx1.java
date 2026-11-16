package strings;

/**
 * STRING
   String objects are immutable/cant modified
   Because they are immutable, objects with same value can be shared
   Use StringBuilder
        When you are constructing a string content dynamically.

          1) equals  : compares the content of two strings
          2) equalsIgnoreCase()
          3) compareTo() : compares the content of two strings eg sorting
          4) compareToIgnoreCase()

 */
public class StringEx1 {

    public static void main(String[] args){
        String s = "abc";//
        s = s + "xyz";

        System.out.println(s);

        System.out.println();

        String s1 = "pqr";
        String s2 = "pqr";

        String s3 = new String("pqr");

        // reference comparison
        if (s1 == s3){
            System.out.println("equal");
        }else{
            System.out.println("not equal");
        }

        // Modified the string
        StringBuilder sb = new StringBuilder("my first string");
        sb.append("My  seconds tring");
        sb.append("My third   string");
        String str = sb.toString();

        System.out.println(str);

        String str1 = "abc";  //ascii code
        String str2 = "ABC";



        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        if (str1.compareTo(str2) > 0){

            System.out.println("str1 is greater than str2"); //>
        } else if (str1.compareTo(str2) < 0) {

            System.out.println("str1 is less than str2");//<
        }else {
            System.out.println("str1 is equal to str2");//==
        }
    }
}
