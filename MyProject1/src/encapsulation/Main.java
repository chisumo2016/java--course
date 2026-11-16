package encapsulation;

public class Main {

	public static void main() {
		Employee  e = new Employee();
		
		e.setId(6);
		e.setName("John");
		e.setSalary(300000);
		
		
		System.out.println("Name: " +e.getName());
		System.out.println("ID: " +e.getId());
		System.out.println("Salary: " +e.getSalary());
		
	}
}
