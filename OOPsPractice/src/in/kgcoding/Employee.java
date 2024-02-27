package in.kgcoding;

class Employee {
    private String name;
    private int age;
    private int salary;
    

    Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    Employee(){

    }


    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getSalary() {
        return salary;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    
   
    String getEmployeeDetails() {
        return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }

    
}
