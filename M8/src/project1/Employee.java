package project1;

public class Employee {
	String Name;
	String Surname;
	String Address;
	private double Salary;
	public Employee(String name, String surname, String address, double salary) {
		super();
		Name = name;
		Surname = surname;
		Address = address;
		Salary = salary;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	
	
}
