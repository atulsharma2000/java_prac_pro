package dmc;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

enum Role{
	BATSMAN,BOWLER
}

public class Criketer {
	String name;
	String gender;
	int age;
	String email_id;
	int contact;
	int rating;
	Role role;
	
	
	
	public Criketer(String name, String gender, int age, String email_id, int contact, int rating, Role role) {

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
		return "Criketer [name=" + name + ", gender=" + gender + ", age=" + age + ", email_id=" + email_id
				+ ", contact=" + contact + ", rating=" + rating + ", role=" + role + "]";
	}



	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String name;
		String gender;
		int age;
		String email_id;
		int contact;
		int rating;
		Role role;
		int rolee;
		
		List<Criketer > list = new ArrayList<Criketer >();
		
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
					contact = sc.nextInt();
					System.out.print("Enter Rating (1 to 10) = ");
					rating = sc.nextInt();
					
					System.out.println("Select the role (1 for BATSMAN, 2 for BOWLER) = ");
					rolee = sc.nextInt();
					
					if(rolee==1)
						role = role.BATSMAN;
					if(rolee==2)
						role=role.BOWLER;
					if(rolee!=1 || rolee!=2) {
						System.out.println("Invalid value in role , Defaulting to batsma");
						role= role.BATSMAN;
					}
						
					
					sc. next();
				}catch(InputMismatchException e) {
					System.out.println("Invalid input Please enter intergers for marks.");
					sc.next();
					continue;
				}
				System.out.print("Enter Email_id = ");
				email_id = sc.next();
				
				Criketer player = new Criketer(name, gender, age, email_id, contact, rating, role);
				list.add(player);
				System.out.println("Record Succesfully added !\n");
				break;

			case 2:
				System.out.println("----- Remove Cricketer------");

				System.out.print("Enter name of Cricketer = ");
				String man = sc.next();
				for(Criketer e : list) {
					
				}
				
				System.out.println();
				break;

			case 3: 
				System.out.println("--------Search----------------");

				System.out.println("Enter ID to search :-  ");
				break;


			case 5:

				flag = false;
				System.out.println("Exiting the Program...");
				break;
			default:
				System.out.println("Invalid Choice, please enter correct choice from menu.");
				break;
			}
		}
		
			
	}

}
