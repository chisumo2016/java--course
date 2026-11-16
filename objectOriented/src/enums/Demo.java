package enums;
/***
 * Enum
 */


enum Status  //class
{
	// 0 1 2
	Running, Failed, Pending , Success  //object
}

public class Demo {

	public static void main(String[] args) {
		
		// Access the enum
        Status s =  Status.Running;
        
        
        Status[] arr =  Status.values();
        
        System.out.println(s.ordinal());
        System.out.println(arr[0]);
        
        // print all
        for(Status s1 : arr) {
        	System.out.println(s1 + " : " + s1.ordinal());
        }
	}

}
