package Q2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class SingerTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		List<Singer> list = new ArrayList<Singer>();
		
		Collections.addAll(list,
				new Singer("jai", "male", 18, "jai@gmail.com", 602455666, 7),
				new Singer("atul", "male", 24, "atul@gmail.com", 902455666, 8),
				new Singer("pingu", "female", 66, "pingu@gmail.com", 992455666, 6));
		
		
		int key;
		boolean flag = true;
		while(flag){
			
			SingerEnum.displayMenu();
			System.out.print("Enter choice = ");
			key = sc.nextInt();
			

			switch (key) {
			case 1:
				System.out.println("--------ADD Singer----------");
				list.add(acceptRecord(sc));
				System.out.println("Singer Details added Succesfully !\n");
				break;
			case 2:
				System.out.println("-------Remove Singer------------");

				System.out.print("Enter name to remove= ");
				String keyN = sc.next();
				boolean ff=false;
				for(Singer e : list) {
					if(e.name.equals(keyN)) {
						list.remove(e);
						ff=true;
						break;
					}
				}
				if(ff) {

					System.out.println("Singer has been removed !\n");
				}else {System.out.println("No such singer with name "+keyN );}
				
				break;

				
				
			case 3:
				System.out.println("\n-------Modify singer rating---------------");
				
				
				System.out.print("Enter name to change its rating = ");
				String keyNN = sc.next();
				boolean fff=false;
				for(Singer e : list) {
					if(e.name.equals(keyNN)) {
						System.out.print("Enter new Rating = ");
						int rate = sc.nextInt();
						e.rating = rate;
						fff=true;
						break;
					}
				}
				if(fff) {

					System.out.println("Singer Rating has been modified !\n");
				}else {System.out.println("No such singer with name "+keyNN );}
				
				break;
				
			case 4:
				
				

				System.out.print("Enter name to find singer details = ");
				String keyNNN = sc.next();
				boolean ffff=false;
				for(Singer e : list) {
					if(e.name.equals(keyNNN)) {
						System.out.print("\n----Singer Found----> ");
						System.out.println(e);
						ffff=true;
						break;
					}
				}
				if(ffff) {

				}else {System.out.println("No such singer with name "+keyNNN );}
				
				break;
				
			case 5:
				list.sort(Comparator.comparing(Singer::getName));
				System.out.println("Sorting has been done !!\n");
				break;
		
				
			case 6:
				list.forEach(System.out::println);
				break;

				
			case 7:
				System.out.println("Bye bye....");

				flag= false;
				break;

			default:
				System.out.println("Invalid choice ! Please enter correct one !");
				break;
			}

		}

	}
	
	
	

	private static Singer acceptRecord(Scanner sc) {
		
		
		String name;
		String gender;
		int age;
		String email_id;
		long contat;
		int rating;
		
		System.out.print("Enter name = ");
		name = sc.next();

		System.out.print("Enter gender = ");
		gender = sc.next();

		System.out.print("Enter age = ");
		age = sc.nextInt();

		System.out.print("Enter email id = ");
		email_id= sc.next();
		
		System.out.print("Enter Contact = ");
		contat = sc.nextInt();
		
		System.out.print("Enter rating (1 to 10) = ");
		rating = sc.nextInt();
		
		Singer s = new Singer(name, gender, age, email_id, contat, rating);
		return s;
		
		
	}

}
