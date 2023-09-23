package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GroupingByEmployees {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Employee e1=new Employee(1, "Naveen", "Chennai", "Developer");
		Employee e2=new Employee(2, "Jai", "Chennai", "Developer");
		Employee e3=new Employee(3, "Aravind", "Chennai", "Developer");
		Employee e4=new Employee(4, "Alex", "America", "Tester");
		Employee e5=new Employee(5, "Joe", "Banglore", "Tester");
		Employee e6=new Employee(6, "Steve", "Banglore", "Manager");
		
		List<Employee> employee=Arrays.asList(e1,e2,e3,e4,e5,e6);
		
		employee.stream().collect(Collectors.groupingBy(Employee::getDesignation))
		.entrySet().forEach(x->{
			System.out.print(x.getKey()+" = ");
			
		System.out.println(x.getValue().stream().map(Employee::getName).collect(Collectors.joining(",")));
		});
	}
	}


