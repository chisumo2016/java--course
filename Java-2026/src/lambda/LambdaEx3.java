package lambda;
/*
   Capital letter go faster than small letter bbs of ASCII code  A 65 a97
 */
import java.util.Arrays;
import java.util.Comparator;

public class LambdaEx3 {
    public static void main(String[] args) {

        String arr[] = {"abc", "cb" , "ac" , "ABC"};
        //Arrays.sort(arr);


        /*Separate class*/
        //Arrays.sort(arr, new DescComparator());

        /*Anonymous implementation*/
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                    // will give the descending order of ASCII code
//                    return -1 * s1.compareTo(s2);
//                    //return s2.compareToIgnoreCase(s1);
//
//            }
//        });
        System.out.println();


        /*Lambda implementation  -1 */
        //Arrays.sort(arr, (s1, s2) -> -1 * s1.compareTo(s2));
        //Arrays.sort(arr, (s1, s2) -> -1 * s1.compareToIgnoreCase(s2));

        /*Lambda method reference -1 */
        Arrays.sort(arr, String::compareToIgnoreCase);

        System.out.println(Arrays.toString(arr));



    }
}

class DescComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return -1 * s1.compareTo(s2);  // will give the descending order of ASCII code
        //return s2.compareToIgnoreCase(s1);
    }
}
