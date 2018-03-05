package in.co.employee;

import java.util.Set;

public class Employee {

	private int id;

	private String firstName;
	private String lastName;
	private String salary;
	private String location;
	private Set certificates;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Set getCertificates() {
		return certificates;
	}

	public void setCertificates(Set certificates) {
		this.certificates = certificates;
	}

}
