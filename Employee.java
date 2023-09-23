package Collections;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Employee {
	
	int id;
	String name;
	String city;
	String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int id, String name, String city, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", designation=" + designation + "]";
	}
	
	
}

