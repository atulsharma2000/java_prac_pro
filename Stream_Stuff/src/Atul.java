
public class Atul {

	private int id;
	private String name;
	private double salary;
	private String job;
	public Atul(int id, String name, double salary, String job) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.job = job;
	}
	@Override
	public String toString() {
		return "Atul [id=" + id + ", name=" + name + ", salary=" + salary + ", job=" + job + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}

	
}
