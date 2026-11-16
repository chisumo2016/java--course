package abstraction;

public class Employee extends Person {

    private int EmpId;

    public Employee(String EmployeeName, String Gen, int EmployeeId) {
        super(EmployeeName, Gen);
        this.EmpId = EmployeeId;
    }

    @Override
    public void work() {
        if (EmpId == 0) {
            System.out.println("Employee Logged out");
        } else {
            System.out.println("Employee Logged In");
        }
    }

    public static void main(String[] args) {

        Person employee = new Employee("Pavithra", "Female", 1094826);

        employee.work();

        employee.changeName("Pavithra Tripathy");

        System.out.println(employee.toString());
    }
}