package writingfunctions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {

		Employee employee = new Employee(501, "Gagan", 10000.0, 10);
		Employee employee1 = new Employee(201, "adarsh", 20000.0, 0);
		Employee employee2 = new Employee(50, "kaka", 30000.0, 11);
		Employee employee3 = new Employee(30, "Lakhvir", 40000.0, 23);
		List<Integer> set = new ArrayList<Integer>();
		set.add(employee.getAge());
		set.add(employee1.getAge());
		set.add(employee2.getAge());
		set.add(employee3.getAge());
//		System.out.println(set);
		System.out.println(employee3.compareTo(34));
//		System.out.println(set);
	}
}

class Employee implements Comparable<Integer> {

	private Integer empId;
	private String name;
	private Double salary;
	private Integer age;

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(Integer empId, String name, Double salary, Integer age) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public int compareTo(Integer o) {
		if (this.getAge() == 0) {
			return 0;
		} else if (this.getAge() > o) {
			return 1;
		} else {
			return -1;
		}
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
}