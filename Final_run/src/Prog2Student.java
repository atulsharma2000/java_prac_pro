

public enum Prog2Student {
ACCEPT(1,"Accept Record"),
VIEW(2,"Print Record"),
SORT(3,"Sort Record"),
SEARCH(4,"Search Record"),
EXIT(5,"Exit");
	
	private final int value;
	private final String description;
	
	private Prog2Student(int value, String description) {
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
		System.out.println("\n--------All Operations-------");
		
		for(Prog2Student  ele : values()) {
			System.out.println(ele.getValue()+". "+ele.getDescription());
		}
		
		System.out.println("-----------------------------------------");
	}
	
}
