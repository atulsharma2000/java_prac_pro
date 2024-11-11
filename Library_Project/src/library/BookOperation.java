package library;

public enum BookOperation {
ADD_BOOK(1,"Add Book"),
VIEW_BOOKS(2,"View Books"),
BORROR_BOOKS(3,"Borrow Books"),
Return_Book(4,"Return Book");
	
	private final int value;
	private final String description;
	
	private BookOperation(int value, String description) {
		this.value = value;
		this.description = description;
	}

	public int getValue() {
		return value;
	}

	public String getDescription() {
		return description;
	}
	
	public static void displayMenu() {
		System.out.println("\n--------Book Operations-------");
		
		for(BookOperation ele : values()) {
			System.out.println(ele.getValue()+". "+ele.getDescription());
		}
		
		System.out.println("-----------------------------------------");
	}
	
}
