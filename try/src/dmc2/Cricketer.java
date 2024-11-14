package dmc2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;



enum Role{
	BATSMAN,BOWLER
}

public class Cricketer {
	String name;
	String gender;
	int age;
	String email_id;
	long contact;
	int rating;
	Role role;

	

	
	public Cricketer(String name, String gender, int age, String email_id, long contact, int rating, Role role) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.email_id = email_id;
		this.contact = contact;
		this.rating = rating;
		this.role = role;
	}




	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", gender=" + gender + ", age=" + age + ", email_id=" + email_id
				+ ", contact=" + contact + ", rating=" + rating + ", role=" + role + "]";
	}

	public int getRating() {
	    return rating;
	}




	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		
		String name;
		String gender;
		int age;
		String email_id;
		long contact;
		int rating;
		Role role = null;
		int rolee;
		
		
		List<Cricketer > list = new ArrayList<Cricketer>();
		
		Collections.addAll(list, 
				new Cricketer("atul", "male", 23, "atul@gmail.com", 908891234, 10, role.BATSMAN ),

				new Cricketer("jai", "male", 13, "jail@gmail.com", 888791234, 7, role.BOWLER ),

				new Cricketer("pingu", "female", 22, "pingu@gmail.com", 768891234, 10, role.BATSMAN ));
		
		boolean flag = true;
		int key ;
		
		while(flag) {
			CricketEnum.displayMenu();
			try {
			System.out.print("Enter chocie => ");
			key = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("Invalid Input ! please enter integer.");
				sc.next();
				continue;
			}
			
			switch (key) {
			case 1:
				System.out.println("--------------Add Cricketer-------------");
				System.out.print("Enter name = ");
				name = sc.next();
				System.out.print("Enter Gender = ");
				gender = sc.next();
				
				try {
					System.out.print("Enter Age = ");
					age = sc.nextInt();
					System.out.print("Enter Contact = ");
					contact = sc.nextLong();
					System.out.print("Enter Rating (1 to 10) = ");
					rating = sc.nextInt();
					
					System.out.print("Select the role (1 for BATSMAN, 2 for BOWLER) = ");
					rolee = sc.nextInt();
					
                    if (rolee == 1) {
                        role = Role.BATSMAN; 
                    } else if (rolee == 2) {
                        role = Role.BOWLER; 
                    } else {
                        System.out.println("Invalid value for role. Defaulting to BATSMAN.");
                        role = Role.BATSMAN; 
                    }
					
				}catch(InputMismatchException e) {
					System.out.println("Invalid input Please enter intergers for marks.");
					sc.next();
					continue;
				}
				System.out.print("Enter Email_id = ");
				email_id = sc.next();
				
				Cricketer player = new Cricketer(name, gender, age, email_id, contact, rating, role);
				list.add(player);
				System.out.println("Record Succesfully added !\n");
				break;

			case 2:
				System.out.println("----- Remove Cricketer------");

				System.out.print("Enter name of Cricketer = ");
				String man = sc.next();
				boolean f = false;
				for(Cricketer e : list) {
					if(e.name.equals(man)) {
						list.remove(e);
						f=true;
						break;
					}
				}
				if(f)
				System.out.println("Element removed successfully!\n");
				else
					System.out.println("Element not founds!\n");
				break;

			case 3: 
				System.out.println("--------Modify role----------------");
				

				System.out.print("Enter name of Cricketer = ");
				String man2 = sc.next();
				boolean f2 = false;
				for(Cricketer e : list) {
					if(e.name.equals(man2)) {
						if(e.role == role.BATSMAN)
								e.role = role.BOWLER;
						else
							e.role = role.BATSMAN;
						f2=true;
						break;
					}
				}
				if(f2)
				System.out.println("Role has changed ! \n");
				else
					System.out.println("Element not founds!\n");
				
				break;


			case 4:
				System.out.println("--------Search by rating---------------");
				
				System.out.print("Enter Rating = ");
				int ratting = sc.nextInt();
				boolean f3 = false;
				for(Cricketer e : list) {
					if(e.rating==ratting) {
						System.out.println(e);
						f3=true;
					}
				}
				if(f3) {
				System.out.println("--------- Succesfully found Cricketer with rating "+ratting+" -----------");
				
				}
				else
					System.out.println("No cricketer with" +ratting+"\n");
				break;
				
			case 5:
				
				Collections.sort(list, Comparator.comparing(Cricketer::getRating));
				break;
				
			case 6:
				System.out.println("------Displaying all Registered Cricketers------------ ");
				Iterator<Cricketer> iter = list.iterator();
				
				while(iter.hasNext()) {
					Cricketer c  = iter.next();
					System.out.println(c);
				}
//				
//				for(Cricketer ele: list)
//					System.out.println(ele);
				break;
				
			case 7:
				flag = false;
				System.out.println("Exiting the Program...");
				break;
				
			default:
				System.out.println("Invalid Choice, please enter correct choice from menu.");
				break;
			}
		}
		
sc.close();
	}

}
