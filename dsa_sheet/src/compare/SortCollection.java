package compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class SortCollection {

	public static void main(String[] args) {
//		ArrayList<Integer> marks = new ArrayList<>();
//		marks.add(12);
//		marks.add(34);
//		marks.add(4);
//		System.out.println(marks);
//		Collections.sort(marks);
//		System.out.println(marks);
		/**
		 * object have different data type
		 * so we can short object with all attribute.
		 * so for this we use comparable and comparator.
		 * 
		 */
		ArrayList<EmployeeComparator> emps = new ArrayList<>();
		emps.add(new EmployeeComparator("Sheeshpal","92834733",12));
		emps.add(new EmployeeComparator("Durgesh","923847323",11));
		emps.add(new EmployeeComparator("Shagun","90234023",14));
		
		//using comparable.....
		System.out.println(emps);
		Collections.sort(emps,new IdComprator());
		System.out.println(emps);
		
		//using comparator
//		System.out.println(emps);
//		Collections.sort(emps, new IdComprator());
		
		
	}
}
