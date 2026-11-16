package StringBuffer;

// is safe = StringBuffer
public class Demo {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("Navin");
		
		sb.append(" Ready");
		sb.delete(2,0);
		sb.insert(0 , " Java");
		sb.subSequence(0, 0);
		sb.setLength(30);
		sb.ensureCapacity(100);
		
		String str = sb.toString();
		
		System.out.println(sb.capacity());
		System.out.println(sb.length());

	}

}
