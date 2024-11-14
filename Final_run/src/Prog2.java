import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;



class Student {
	String name;
	String gender;
	int roll; // auto generated
	int[] marks = new int[3];
	double percentage;
	public Student(String name, String gender, int roll, int sub1,int sub2,int sub3) {

		this.name = name;
		this.gender = gender;
		this.roll = roll;
		marks[0] = sub1;
		marks[1] = sub2;
		marks[2] = sub3;

		percentage = ((marks[0]+marks[1]+marks[2])/300.0)*100;
	}
	@Override
	public String toString() {
		
		return String.format("Student [name=%s, gender=%s, roll=%d, Percentage=%.2f%%]", name, gender, roll, percentage);
	}	


}


public class Prog2 {

	static void sortRecord() {

	}

	static void  searchRecord(int id, List<Student> list) {
		List<Student> s = list.stream()
				.filter(e->e.roll == id)
				.collect(Collectors.toList());
		s.forEach(System.out::println);

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		String name;
		String gender;
		int roll=0;
		int mark1;
		int mark2;
		int mark3;

		List<Student> students = new ArrayList<Student>();

		Student[] stuArr = new Student[5];
		boolean flag = true;
		int key ;
		while(flag) {
			Prog2Student.displayMenu();
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
				System.out.println("--------------Enter Recors-------------");
				System.out.print("Enter name = ");
				name = sc.next();
				System.out.print("Enter Gender = ");
				gender = sc.next();
				roll ++;
				try {
					System.out.print("Enter Sub1 mark = ");
					mark1 = sc.nextInt();
					System.out.print("Enter Sub2 mark = ");
					mark2 = sc.nextInt();
					System.out.print("Enter Sub3 mark = ");
					mark3 = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("Invalid input Please enter intergers for marks.");
					sc.next();
					continue;
				}

				Student st = new Student(name, gender, roll, mark1, mark2, mark3);
				students.add(st);
				System.out.println("Record Succesfully added !\n");
				break;

			case 2:
				System.out.println("------Viewing all Records------");

				students.forEach(System.out::println);

				System.out.println();
				break;

			case 3:
				System.out.println("-------Sorting---------------");
				System.out.println("1. sort based on name\n2. sort based on gender\n3. sort based on rollNum\n4. Percentage");
				System.out.print("Enter sorting choice - ");
				int c = sc.nextInt();
				sc.nextLine();

				switch (c) {
				case 1:


					students.sort(Comparator.comparing(e -> e.name));

					System.out.println("Sorted done by name !\n");
					break;

				case 2:
					students.sort(Comparator.comparing(e->e.gender));
					System.out.println("Sorted done by gender !\n");
					break;


				case 3:

					class RollComparator implements Comparator<Student>{

						@Override
						public int compare(Student o1, Student o2) {
							return Integer.compare(o1.roll, o1.roll);
						}
					}
					
					students.sort(new RollComparator());
					System.out.println("Sorted done by roll number !");


					break;

				case 4:
					students.sort(Comparator.comparing(e->e.roll));
					System.out.println("Sorted by Roll number done!\n");
					break;

				default:
					System.out.println("Invalid option selected !");
					break;
				}

				break;

			case 4: 
				System.out.println("--------Search----------------");

				System.out.print("Enter ID to search :-  ");
				int find = sc.nextInt();
				sc.nextLine();
				searchRecord(find,students);


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


		sc.close();
	}

}
