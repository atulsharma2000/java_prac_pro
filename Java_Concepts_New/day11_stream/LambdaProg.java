package day11_stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaProg {
	
public static void main(String[] args) {
	 Employee[] arr = new Employee[] {
			 new Employee(4, "B", "Clerk", "Sales", 723.44),
	            new Employee(8, "X", "Manager", "Accounts", 823.23),
	            new Employee(2, "P", "Clerk", "Research", 234.23),
	            new Employee(9, "N", "Manger", "Sales", 252.53),
	            new Employee(5, "D", "Clerk", "Accounts", 923.23),
	            new Employee(1, "Q", "Analyst", "Research", 826.23),
	            new Employee(7, "H", "Clerk", "Research", 845.24),
	            new Employee(6, "A", "Analyst", "Research", 832.23),
	            new Employee(3, "G", "Analyst", "Sales", 952.44)
	 };			 
	 
	 class EmpIdComparaator implements  Comparator<Employee>{
		@Override
		public int compare(Employee o1, Employee o2) {
			return o1.getId()-o2.getId();
		}		
	 }
	 
	Arrays.sort(arr,new EmpIdComparaator());
	for(Employee e: arr)
			System.out.println(e);
	
	
	Arrays.sort(arr, (x,y) -> -Double.compare(x.getSal(), y.getSal()));
	List<Employee> list = Arrays.asList(arr);
	list.forEach(e -> System.out.println(e.toString()));
	System.out.println();
	
	list.sort((x,y) -> x.getName().compareTo(y.getName()));
	list.forEach(e -> System.out.println(e));
	
	System.out.println();
	
	list.sort((x,y) ->  x.getId() - y.getId());
	list.forEach(e -> System.out.println(e));
	System.out.println();
	 
	Arrays.sort(arr, (Employee x, Employee y) -> {
    	int diff = -x.getJob().compareTo(y.getJob());
    	return diff;
    });
    for (Employee e : arr)
    	System.out.println(e);
	
	}
}
