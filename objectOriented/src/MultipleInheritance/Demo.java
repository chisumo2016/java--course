package MultipleInheritance;


/*Multiple Inheritance - In java doesnt support multiple inheritance**/

class A{
	
}


class B{
	
}


//class C , B {
//
//}


public class Demo {

	public static void main(String[] args) {
		ScientificCalcultor obj = new ScientificCalcultor();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multi(6, 3);
        int r4 = obj.div(12, 3);
        double r5 = obj.power(4, 2);
        
        
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + "  " + r5);

	}

}
