package Q1;

public enum LicEnum {


	LEARNE(1,"LEARNER: age 18–20, experience < 1 year."),
	PERM(2,"PERMANENT: age 21+, experience 1–3 years."),
	COMM(3,"COMMERCIAL: age 25+, experience > 3 years.");


	private final int value;
	private final String description;



	private LicEnum(int value, String description) {
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
		System.out.println("\n--------License type selection-------");

		for(LicEnum ele : values()) {
			System.out.println(ele.getValue()+". "+ele.getDescription());
		}

		System.out.println("-----------------------------------------");
	}

}
