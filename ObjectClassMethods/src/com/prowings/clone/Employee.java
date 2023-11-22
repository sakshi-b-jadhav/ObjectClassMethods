package com.prowings.clone;

public class Employee implements Cloneable {

	int empId;
	String name;
	EmpInfo age;

	public Employee(int empId, String name, EmpInfo age) {
		this.empId = empId;
		this.name = name;
		this.age = age;
	}

//
	public Object clone() throws CloneNotSupportedException {
		EmpInfo a1 = new EmpInfo(age.age);
		Employee emp3 = new Employee(empId, name, a1);
		return emp3;
	}
	
   

	public static void main(String[] args) throws CloneNotSupportedException {
		EmpInfo a = new EmpInfo(2);

		Employee emp = new Employee(1, "sakshi", a);

		System.out.println(emp.empId);
		System.out.println(emp.name);
		System.out.println(emp.age.age);
		Employee emp2 = (Employee) emp.clone();

		System.out.println("======Shallow cloning======");
		emp2.name = "sakshi";
		emp2.empId = 7;
		emp2.age.age = 5;

		System.out.println(emp.empId);
		System.out.println(emp.name);
		System.out.println(emp.age.age);

		System.out.println(emp.name.equals(emp2.name));
		// the variable having a string datatype pointing to same object and it checks
		// content equality
		System.out.println(emp.age.age == emp2.age.age);
		System.out.println(emp.empId == emp.empId);

	}

}
