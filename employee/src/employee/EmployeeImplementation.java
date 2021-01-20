package employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class EmployeeImplementation{
	
	public Employee highestSalary(List<Employee> list) {
		//Finding object having maximum salary and using max
		Comparator<Employee> comparator = Comparator.comparing(Employee::getsalary);
		
		Integer arr[] = new Integer[] {2,44,66,7,88,9};
		
		List<Integer> intlist=Arrays.asList(arr);
		//using Minimum
		System.out.println(intlist.stream().min(Integer::compare).get());
		//sorting integers
		System.out.println(intlist.stream().sorted().collect(Collectors.toList()));
		//sorting employee objects based on salary
		System.out.println(list.stream().sorted(comparator).collect(Collectors.toList()));
		//printing managers
		list.stream().map(p->p.mgrname).forEach(System.out::println);

		//Using Max for integer objects
		System.out.println(intlist.stream().max(Integer::compare).get());
		
		Employee employee = list.stream().max(comparator).get();
		
		return employee;
		
	}
	
	//Filtering By manager
	public long sameManager(List<Employee> list){
		
		long l = list.stream().filter(p->p.mgrname.equals("nitin")).count();
		
		
			
			return l;
	}
	//Filtering by deptNo
public List<Employee> deptNo(List<Employee> list){
		
	List<Employee> list1 = list.stream().filter(p->p.deptno.equals("10")).collect(Collectors.toList());
		
		
			//List<Employee> list1 =	l.collect(Collectors.toList());
			
			return list1;
	}
//Filtering By Salary
public List<Employee> empSalaryLess(List<Employee> list){
		
		Stream<Employee> l = list.stream().filter(p->p.salary<50000);
		
		
			List<Employee> list1 =	l.collect(Collectors.toList());
			
			return list1;
	}
public List<Employee> startWith(List<Employee> list){
	
	Stream<Employee> l = list.stream().filter(p->{
		Pattern pen= Pattern.compile("A.*");
		Matcher m= pen.matcher(p.name);
		return m.matches();
	});
	
	
		List<Employee> list1 =	l.collect(Collectors.toList());
		
		return list1;
}
//using sum
public Double sumOf(List<Employee> list){
	
//	double sum=0;
	
	  Double sum2 =    list.stream().map(p->p.salary).reduce((double) 1,(a,b)->a*b);
	
	
//		List<Employee> list1 =	l.collect(Collectors.toList());
		
		return sum2;
}

	public static void main(String[] args) { 
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(100,"Ahandu",2,"balaji","10"));
		list.add(new Employee(103,"Asta",5,"nitin","10"));
		list.add(new Employee(105,"yash",2,"nitin","1236"));
		list.add(new Employee(107,"shounak",5,"adam","10"));
		list.add(new Employee(109,"Ajay",2,"john","1238"));
		
		System.out.println(list.stream().count());
		
		EmployeeImplementation empimpl = new EmployeeImplementation();
		
		System.out.println(empimpl.highestSalary(list));
	  System.out.println(empimpl.sameManager(list));
	   for(Employee e: empimpl.empSalaryLess(list)) {
		   System.out.println(e);
	    }
	   for(Employee e: empimpl.deptNo(list)) {
		   System.out.println(e);
	    }
	   for(Employee e: empimpl.startWith(list)) {
		   System.out.println(e);
	    }
	   System.out.println(empimpl.sumOf(list));
	   
	   
		
	}
	
}