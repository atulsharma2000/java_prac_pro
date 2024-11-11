package library;

public class LibraryException extends Exception{

	public LibraryException(String message) {
		super(message);
	}
}

class BookNotFoundException extends LibraryException{

	public BookNotFoundException(String isbn) {
		super("Book with ISBN "+isbn+" not found.");
		
	}
}

class UserNotFoundException extends LibraryException(int userID) {
	public UserNotFoundException(String userID) {
		super("Book with ISBN "+userID+" not found.");
		
	}
}

class InsufficientStockException extends LibraryException(String title) {
	public InsufficientStockException(String title) {
        super("Insufficient stock for the book titled: " + title);
    }
}

class InvalidOperationException extends LibraryException {
    public InvalidOperationException(String message) {
        super(message);
    }
}
