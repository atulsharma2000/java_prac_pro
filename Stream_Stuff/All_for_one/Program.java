package All_for_one;

import java.lang.invoke.StringConcatFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> val =  Arrays.asList(1,2,4,5,6);
		
		Stream<Integer> strm = val.stream();
		strm.map(x -> x*x)
		.filter(x -> x%2==0)
		.forEach(e-> System.out.print(e+" "));
		
		System.out.println(
				);
//		Given a list of strings, write a method that counts how many times each string appears in the list and returns a map with the string as the key and its count as the value.
//		Example Input: ["apple", "banana", "apple", "orange", "banana", "apple"]
//		Example Output: {"apple": 3, "banana": 2, "orange": 1}
		
		List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");
		
		Map<String,Long> fruitCount = fruits.stream()
				.collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		fruitCount.forEach((fruit,count) -> System.out.println(fruit+" : "+count));
		
		System.out.println("\n------");
		
		List<String> name = Arrays.asList("apple", "banana", "cherry");
		
		String str = name.stream()
				.collect(Collectors.joining(","));
		
		System.out.println(str);
		
		
		System.out.println("\n------------");
		
		List<String> alp = Arrays.asList("a", "bb", "ccc", "dddd", "ee");
		
		Map<Integer, List<String>> wordLen = alp.stream()
				.collect(Collectors.groupingBy(String::length));
		
		wordLen.forEach((length,word)->System.out.println("length = "+length+": "+word));
		
		
		

		System.out.println("\n------------Remove duplicates ");
		

		List<Integer> nums = Arrays.asList(5, 3, 8, 3, 1, 5);
		
		Set<Integer> res = nums.stream()
				.collect(Collectors.toSet());
		
		res.forEach(System.out::println);
		
		
		
	}

}
