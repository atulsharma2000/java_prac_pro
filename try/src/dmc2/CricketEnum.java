package dmc2;

public enum CricketEnum {


	ACCEPT(1,"Add Cricketer"),
	REMOVE(2,"Remove Cricketer"),
	MODIFY(3,"Modify Cricketers Role"),
	SEARCH(4,"Search Cricketer by rating"),
	SORT(5,"Sort Cricketer by rating"),
	VIEW(6,"Display All Cricketer"),
	EXIT(7,"Exit");

	private final int value;
	private final String description;

	private CricketEnum(int value, String description) {
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

		for(CricketEnum ele : values()) {
			System.out.println(ele.getValue()+". "+ele.getDescription());
		}

		System.out.println("-----------------------------------------");
	}

}

