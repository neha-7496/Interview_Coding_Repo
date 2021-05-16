package interviewRelated;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);
        Integer var = list.stream().min(Integer::compare).get();
        Integer sum = list.stream()
        		  .mapToInt(Integer::intValue)
        		  .sum();
  
        System.out.print(var);
        System.out.print("sum:"+sum);
        
        String[] strArray = {"Sneha","Neha","Suman","namita"};
        List<String> list1 = new ArrayList<String>();
        for(String str : strArray) {
        	list1.add(str);
        }
        List<String> newList = list1.stream().filter(s->s.startsWith("N") || s.startsWith("n")).collect(Collectors.toList());
        newList.forEach(System.out::println);
        
        List<Employee> liste = new ArrayList<Employee>();
        liste.add(new Employee(2,"neha",25));
        liste.add(new Employee(3,"sarthak",30));
        liste.add(new Employee(4,"sambit",31));
        

        List<String> newList1 = liste.stream().map(e->e.getName()).filter(s->s.startsWith("S") || s.startsWith("s")).collect(Collectors.toList());
        newList1.forEach(System.out::println);
    }
}
