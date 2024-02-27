package in.kgcoding;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Atul", 23, 100000);

        System.out.println(emp.getEmployeeDetails());

        emp.setSalary(90909090);
        System.out.println(emp.getEmployeeDetails());

        emp.setName("Awesome");
        System.out.println(emp.getEmployeeDetails());
        
    }
}
