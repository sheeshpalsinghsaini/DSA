package streamAPI;

import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {
		//filter(predicate)-> take boolean value function
		//it's return only true predicate.
		//use lambda e-> true/false expression.
//		List<String> names = List.of("Sheeshpal","Aman","Ankit","Abhinav","Durgesh");
//		List<String> newNames = names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList());
//		System.out.println(newNames);
		
		
		//map(Function)
		/**
		 * we can perform operation on each elements.
		 * 
		 */
		List<Integer> numbers = List.of(23,4,2,5,7,4);
		List<Integer> newNumbers = numbers.stream().map(i->i*i).collect(Collectors.toList());
		System.out.println(newNumbers);
		numbers.stream().sorted().forEach(System.out::println);
		Integer integer = numbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(integer);
	}
}
