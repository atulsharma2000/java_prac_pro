package Q1;

public enum DriverEnum {


			ACCEPT(1,"Add Driver"),
			VIEW(2,"Dispaly all Driver"),
			VIEWBYTYPE(3,"Display Bye Licence Type"),
			EXIT(4,"Exit");

			private final int value;
			private final String description;

			private DriverEnum(int value, String description) {
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
				System.out.println("\n--------Driver Operations-------");

				for(DriverEnum ele : values()) {
					System.out.println(ele.getValue()+". "+ele.getDescription());
				}

				System.out.println("-----------------------------------------");
			}

		}

