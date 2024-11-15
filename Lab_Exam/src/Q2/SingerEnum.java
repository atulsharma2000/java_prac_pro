package Q2;

public enum SingerEnum {


		ACCEPT(1,"Add Singer"),
		REMOVE(2,"Remove Singer"),
		MODIFY(3,"Modify Singer Rating"),
		SEARCH(4,"Search Singer by Name"),
		SORT(5,"Sort Singer by Name"),
		VIEW(6,"Display all Singers"),
		EXIT(7,"Exit");

		private final int value;
		private final String description;

		private SingerEnum(int value, String description) {
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
			System.out.println("\n--------Singer Operations-------");

			for(SingerEnum ele : values()) {
				System.out.println(ele.getValue()+". "+ele.getDescription());
			}

			System.out.println("-----------------------------------------");
		}

	}

