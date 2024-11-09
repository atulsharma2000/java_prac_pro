package CustomExceptionLOL;

public class Program {

	public static void main(String[] args) {
		
		try {
			Time t1 = new Time();
			t1.setHrs(5);
			t1.setMins(2);
			t1.setSecs(1);
			System.out.println("t1 = " + t1.toString() );
			
		} catch (InvalidTimeException e){
			System.out.println(e);
		}

	}

}
	
