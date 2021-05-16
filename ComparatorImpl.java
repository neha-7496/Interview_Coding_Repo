package interviewRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorImpl {
	public static void main(String args[]) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(7,"neha",25));
		list.add(new Employee(8,"sarthak",32));
		list.add(new Employee(3,"suman",27));
		
		
		Comparator<Employee> comp = new Comparator<Employee>() {
				
				@Override
				public int compare(Employee o1, Employee o2) {
					if(o1.getName().compareTo(o2.getName()) == 1) {
						return 1;
					} else {
						return -1;
					}
				}
		};
		Collections.sort(list,comp);
		list.stream().forEach(System.out::println);
		
	}
}
