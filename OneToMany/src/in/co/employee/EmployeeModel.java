package in.co.employee;

import in.co.certificate.Certificate;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeModel {

	public static SessionFactory factory;

	public void addEmployee(Employee employee) {

		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}

		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.save(employee);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

	public void updateEmployee(Employee employee) {

		Session session = factory.getCurrentSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.update(employee);
			tx.commit();
		} catch (HibernateException e) {
			tx.rollback();

		} finally {
			session.close();
		}

	}

	public void deleteEmployee(Employee employee) {
		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}
		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			session.delete(employee);
			tx.commit();
		} catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

	public void listEmployee() {
		if (factory == null) {
			factory = new Configuration().configure().buildSessionFactory();
		}

		Session session = factory.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			List employees = session.createQuery("FROM Employee").list();
			Iterator it = employees.iterator();
			while (it.hasNext()) {
				Employee emp = (Employee) it.next();
				System.out.println("Employee_Name: " + emp.getFirstName());
				System.out.println("Employee_Last_Name: " + emp.getLastName());
				System.out.println("Employee_Salary: " + emp.getSalary());
				System.out.println("Employee_Location: " + emp.getLocation());
				Set certificates = emp.getCertificates();
				Iterator it1 = certificates.iterator();
				while (it1.hasNext()) {
					Certificate certificate = (Certificate) it1.next();
					System.out.println("Employee_Certificates : "
							+ certificate.getCertificateName());

				}

			}
		} catch (HibernateException e) {
			tx.commit();
			e.printStackTrace();
		} finally {
			session.close();
		}
	}
}
