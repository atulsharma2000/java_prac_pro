import java.util.Scanner;

public class Book {
    String title;
    String author;
    String isbn;
    static int totalBooks;

    Book(String title,String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    Book(){
        this("\0","\0","\0");
    }

    public void borrowBook(){

    }
    public void returnBook(){

    }

    public static void getTotalBooks(){
        totalBooks++;
    }

    public static void main(String[] args) {
        System.out.println("\n======Welcome to Library System=====");
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number of Books you want to Enter in Library:- ");
        int numberOfEnteries = sc.nextInt();

        Book[] obj = new Book[numberOfEnteries];  //array of objects
        String a,b,c;

        for(int i=0;i<numberOfEnteries;i++){
            
            System.out.println("Enter Details of Book["+(i+1)+"]: ");

            System.out.print("Title: ");
            a = sc.nextLine();
            // System.out.print("\nAuthor: ");
            // b = sc.nextLine();
            // System.out.print("Isbn: ");
            // c = sc.nextLine();
            b="sad";
            c="asd";

            obj[i]  = new Book(a, b, c);
        
        }
    }
}
