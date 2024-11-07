package Day9.first;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Comparator;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Collections.addAll(bookList, 
				new Book(4, "The Alchemist", "Novel", 493.23),
			    new Book(1, "The Archer", "Novel", 723.53),
			    new Book(5, "The Fountainhead", "Novel", 652.73),
			    new Book(2, "Atlas Shrugged", "Novel", 872.94),
			    new Book(6, "Harry Potter", "Novel", 423.68),
			    new Book(3, "Lord of Rings", "Novel", 621.53)
			    );
		
		int id;
		String name;
		String subject;
		double price;
		
		int choice = 0;
		
		while (choice != 8) {
			
			System.out.println("------------Books Cred Operations-------------");
			System.out.println("1. Add new book \n2. Display all the books \n3. Update a book record by ID \n4. Remove a book by ID \n5. Sort by ID and display \n6. Sort by Book Name and show \n7. Sort by Price and show \n8. Other fucntionlaity  \n9. Exit\n");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter Choice: ");
			choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				System.out.print("Enter Book ID - ");
				id = sc.nextInt();
				
				System.out.print("Enter Book Name - ");
				name = sc.next();
				
				System.out.print("Enter Book Subject - ");
				subject = sc.next();
				
				System.out.print("Enter Book Price - ");
				price = sc.nextDouble();
				
				bookList.add(new Book(id,name,subject,price));
				System.out.println("Book with ID = "+id+" is Succussfully added.\n");
				break;
				
			case 2:
				System.out.println("Here are all the Books and there details:- ");
				for(Book ele: bookList )
					System.out.println(ele);
				System.out.println();
				break;
			
			case 3:
				System.out.print("Enter Book ID to update its records -  ");
				int key_id = sc.nextInt();
				
				for (Book ele: bookList) {
					if (ele.getId() == key_id) {
						int c;
						System.out.println("1. to update name \n2. to update subject \n3. to update price");
						System.out.print("Enter choice for updatation: ");
						c= sc.nextInt();
						if(c ==1) {
						System.out.print("Enter updated name for Book - ");
						name = sc.next();
						ele.setName(name);
						}
						else if(c ==2) {
						System.out.println("Enter updated Subject for Book - ");
						subject = sc.next();
						ele.setSubject(subject);
						}
						else if(c ==3) {
						System.out.println("Enter Price for Book- ");
						price = sc.nextDouble();
						ele.setPrice(price);
						}
						else
							System.out.println("Invalid choice: means you dont want to udpate it\n");
					}
//					else {
//						System.out.println("Invalid ID, no book with ID = "+key_id);
//					}
				}
				break;
				
			case 4:
				System.out.print("Removing book by ID:   Enter ID - ");	
				int del_id = sc.nextInt();
				boolean flag = false;
				
				Iterator<Book> iter = bookList.iterator();
				while(iter.hasNext()) {
					Book book = iter.next();
					if(book.getId()==del_id) {
						iter.remove();    // it will Remove current element
						flag = true;
					}
				}
				
				if (flag)
				System.out.println("Removed Succesfully!");
				else
					System.out.println("No such ID");
				break;
			
			case 5:
				class BookIDComparator implements Comparator<Book>{
					@Override
					public int compare(Book x, Book y) {
						int diff = x.getId()-y.getId();
						return diff;
					}
				}
				
				bookList.sort(new BookIDComparator());
				System.out.println("All the Books are now sorted, based on ID:- ");
				for(Book ele: bookList )
					System.out.println(ele);
				System.out.println();
				break;
				
			case 6:
				class BookNameComparator implements Comparator<Book>{
					@Override
					public int compare(Book x, Book y) {
						int diff = x.getName().compareTo(y.getName());
						return diff;
					}
				}
				
				bookList.sort(new BookNameComparator());
				System.out.println("All the Books are now sorted, based on Name :- ");
				for(Book ele: bookList )
					System.out.println(ele);
				System.out.println();
				break;
				
			case 7:
				class BookPriceComparator implements Comparator<Book>{
					@Override
					public int compare(Book x, Book y) {
						int diff = Double.compare(x.getPrice(),y.getPrice()	);
						return diff;
					}
				}
				bookList.sort(new BookPriceComparator());
				System.out.println("All the Books are now sorted, based on Price :- ");
				for(Book ele: bookList )
				System.out.println(ele);
				System.out.println();
				break;
				
			case 8:
				
			case 9:
				System.out.println("Bye bye....");
				break;

			default:
				System.out.println("Invalid Choice\n");
				break;
			}
		}

	}

}
