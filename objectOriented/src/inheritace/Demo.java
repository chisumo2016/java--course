package inheritace;

/** Inheritance**/


public class Demo {

	public static void main(String[] args) {
		
		AdvanceCalculator obj = new AdvanceCalculator();
        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multi(6, 3);
        int r4 = obj.div(12, 3);
        
        
        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4);
	}

}
