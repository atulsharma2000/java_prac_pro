package lib;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    
    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(String isbn) throws CustomException {
        Book bookToRemove = books.stream()
                                  .filter(b -> b.getIsbn().equals(isbn))
                                  .findFirst()
                                  .orElseThrow(() -> new CustomException("Book not found"));
        books.remove(bookToRemove);
    }

    public void displayBooks() {
        books.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
    }
}