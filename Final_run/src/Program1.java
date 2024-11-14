import javax.naming.CompositeName;

class Date{
	int day,month,year;

	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
}

class Person{
	String name;
	String address;
	Date birthday;
	public Person(String name, String address, int day, int month,int year) {
		
		this.name = name;
		this.address = address;
		birthday = new Date(day,month,year); 
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", birthday=" + birthday.day+ "/"+birthday.month+"/"+birthday.year+"]";
	}
	
}

public class Program1 {
	public static void main(String[] args) {
		Person p1 = new Person("atul", "jaipur", 25, 8, 2000);
		System.out.println(p1);
		
	}
}
