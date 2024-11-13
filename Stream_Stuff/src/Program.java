import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Program {

	static final String EMP = "atul.csv";
	public static void main(String[] args) {
		
		
		Path path = Paths.get(EMP);
		
		try(Stream<String> str = Files.lines(path)){
			
			str.skip(1)
			.forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		-==========================================
		System.out.println("\nnew stuff");
		
try(Stream<String> strm = Files.lines(path)){
			strm.skip(1)
			.map(line -> line.split(","))
			.forEach(System.out::println);
			
		} catch (Exception e) {
			e.printStackTrace();
		}


//-==========================================
System.out.println("\nnew stuff");

try(Stream<String> strm = Files.lines(path)){
	strm.skip(1)
	.map(line -> line.split(","))
	.forEach(e-> System.out.println(String.join(", ", e)));
	
} catch (Exception e) {
	e.printStackTrace();
}




//-==========================================
System.out.println("");
System.out.println("\nnew stuff");

try(Stream<String> strmm = Files.lines(path)){
	
	double total = strmm
			.skip(1)
			.map(line -> parseAtul(line))
			.filter(e-> e.getJob().equals("ANALYST"))
			.mapToDouble(e->e.getSalary())
			.sum();
		System.out.println("Total sal of Analyst = " +  total);
	
} catch (Exception e) {
	e.printStackTrace();
}

//-==========================================
System.out.println("");
System.out.println("\nnew stuff");

try(Stream<String> strmm = Files.lines(path)){
	
	strmm
			.skip(1)
			.map(line -> parseAtul(line))
			.filter(e-> e.getJob().equals("ANALYST"))
			.forEach(System.out::println);
	
} catch (Exception e) {
	e.printStackTrace();
}


//-==========================================
System.out.println("");
System.out.println("\nnew stuff");

try(Stream<String> strmm = Files.lines(path)){
	
	strmm
			.skip(1)
			.map(line -> parseAtul(line))
			.filter(e-> e.getId()==1)
			.forEach(System.out::println);
	
} catch (Exception e) {
	e.printStackTrace();
}


//-==========================================
	System.out.println("");
	System.out.println("\nnew stuff");
	
	List<Atul> listss = new ArrayList<Atul>();
	try(Stream<String> strmm = Files.lines(path)){
		
		strmm.skip(1)
		.map(line->parseAtul(line))
		.forEach(listss::add);
		
		listss.forEach(System.out::println
				);
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}







		
	}
	private static Atul parseAtul(String line) {
		
		String[] parts = line.split(",");
		int id;
		try {
		id = Integer.parseInt(parts[0]);
		} catch(NumberFormatException e) {
			id=0;
		}
		String name = parts[1];
		double salary = Double.parseDouble(parts[2]);
		String job = parts[3];
 		
		Atul obj = new Atul(id,name,salary,job);
		return obj;
	}

}
