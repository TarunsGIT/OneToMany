package in.co.employeeTest;

import java.util.HashSet;

import in.co.certificate.Certificate;
import in.co.employee.Employee;
import in.co.employee.EmployeeModel;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {

	private static SessionFactory factory;

	public static void main(String[] args) {
		//testAddEmployee();
		testListEmployee();

	}

	private static void testListEmployee() {

		EmployeeModel model = new EmployeeModel();
		model.listEmployee();
		

	}

	private static void testAddEmployee() {

		Employee e1 = new Employee();
		HashSet s1 = new HashSet();
		EmployeeModel model = new EmployeeModel();

		s1.add(new Certificate("SCJP"));
		s1.add(new Certificate("OCJP"));
		s1.add(new Certificate("CLOUD COMPUTING"));

		e1.setFirstName("Cris");
		e1.setLastName("Gopikrishnan");
		e1.setLocation("Mysore");
		e1.setSalary("100000");
		e1.setCertificates(s1);

		model.addEmployee(e1);
	}
}
