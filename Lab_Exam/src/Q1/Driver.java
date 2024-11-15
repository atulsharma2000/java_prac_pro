package Q1;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import Q1.DriverTest.InvalidTimeException;

enum LicenseType{
	LEARNER, PERMANENT,COMMERCIAL;
}

public class Driver {
	String name;
	int id;
	int age;
	long mobile;
	String email;
	String address;
	int yearsOfExperience;
	LicenseType lictype;

	public Driver(String name, int id, int age, long mobile, String email, String address, int yearsOfExperience,
			LicenseType lictype) {

		this.name = name;
		this.id = id;
		this.age = age;
		this.mobile = mobile;
		this.email = email;
		this.address = address;
		this.yearsOfExperience = yearsOfExperience;
		this.lictype = lictype;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		
		this.age = age;
	}
	public void setYearsOfExperience(int yearsOfExperience)throws InvalidExperienceException {
		if (yearsOfExperience<1 )
			throw new InvalidExperienceException("Experinece",yearsOfExperience);
		this.yearsOfExperience = yearsOfExperience;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}


	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	

	public LicenseType getLictype() {
		return lictype;
	}

	public void setLictype(LicenseType lictype) {
		this.lictype = lictype;
	}

	@Override
	public String toString() {
		return "Driver [name=" + name + ", id=" + id + ", age=" + age + ", mobile=" + mobile + ", email=" + email
				+ ", address=" + address + ", yearsOfExperience=" + yearsOfExperience + ", lictype=" + lictype + "]";
	}


	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		List<Driver> list = new ArrayList<Driver>();

		Collections.addAll(list, 
				new Driver("atul", 1, 23, 902342313, "atul@gmail.com", "Jaipur", 3, LicenseType.PERMANENT),

				new Driver("Jul", 2, 22, 602342313, "Jul@gmail.com", "Pune", 3, LicenseType.LEARNER));


		int key;
		boolean flag = true;
		while(flag){

			DriverEnum.displayMenu();
			System.out.print("Enter choice = ");
			key = sc.nextInt();


			switch (key) {
			case 1:
				System.out.println("\n--------AlDD Driver Details----------");
				
				Driver d = acceptRecord(sc);
				if (d==null)
					System.out.println("Enter correct values then only data will be saved !");
				else {
				list.add(d);
				System.out.println("Driver Details added Succesfully !\n");
				}
				break;


			case 2:
				System.out.println("-------Displaying all Drivers------");


				displayAllDrivers(list);

				break;	




			case 3:
				System.out.println("\n-------Displaying drivers with a specific license type.---------------");
				
				int lictype;
				LicenseType gg;
				
				LicEnum.displayMenu();
				
				System.out.print("Enter Type 1/2/3 = ");
				lictype = sc.nextInt();
				if(lictype==1)
					gg= LicenseType.LEARNER;
				else if(lictype==2)
					gg= LicenseType.PERMANENT;
				else if(lictype==3)
					gg=LicenseType.COMMERCIAL;
				else
					gg=LicenseType.LEARNER;
				
				displayByLicenseType(gg,list);

				break;




			case 4:
				System.out.println("Bye bye....");

				flag= false;
				break;

			default:
				System.out.println("Invalid choice ! Please enter correct one !");
				break;
			}

		}

	}





	private static void displayByLicenseType(LicenseType gg, List<Driver> list) {
		
		list.stream()
		.filter(e->e.lictype.equals(gg))
		.forEach(e->System.out.println(e));
		
	}

	private static void displayByLicenseType(LicenseType gg) {
		
		
	}

	private static void displayAllDrivers(List<Driver> list) {
		System.out.println();
		list.forEach(System.out::println);
	}

	private static Driver acceptRecord(Scanner sc) {

		String name;
		int id;
		int age;
		long mobile;
		String email;
		String address;
		int yearsOfExperience;
		int lictype;
		LicenseType gg;

		System.out.print("Enter name = ");
		name = sc.next();

		System.out.print("Enter ID = ");
		id = sc.nextInt();
		
		
	
		System.out.print("Enter mobile = ");
		mobile = sc.nextLong();

		System.out.print("Enter email id = ");
		email= sc.next();

		System.out.print("Enter address = ");
		address = sc.next();

		System.out.print("Enter Age = ");
		age = sc.nextInt();
		
		if(age<0) {
			
			 System.out.println("InvalidException:  Age<18 !");
			 return null;
		}

		LicEnum.displayMenu();
		System.out.print("Enter 1/2/3 = ");
		lictype = sc.nextInt();
		if(lictype==1) {
			
			gg= LicenseType.LEARNER;
		}
		else if(lictype==2)
			gg= LicenseType.PERMANENT;
		else if(lictype==3)
			gg=LicenseType.COMMERCIAL;
		else
			gg=LicenseType.LEARNER;



		Driver s = new Driver(name, id, age, mobile, email, address, 5,gg);
		
		
		
		System.out.print("Enter YEAR of Experience = ");
		yearsOfExperience = sc.nextInt();
		
		
		try {
			
			s.setYearsOfExperience(yearsOfExperience);
		} catch (InvalidExperienceException e) {
			e.printStackTrace();
			System.out.println("You are not Experienced enough !");
			return null;
		}
		
		
		return s;


	}

	


}



