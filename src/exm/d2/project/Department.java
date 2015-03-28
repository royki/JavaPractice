package exm.d2.project;

import java.util.ArrayList;
import java.util.List;

public class Department {
	private String deptName;
	private double budget;
	private int counter = 0;

	// private Employee[] emps = new Employee[5];
	private List<Employee> emps = new ArrayList<>();

	public Department(String deptName) {
		this.deptName = deptName;
		this.budget = 5000;
	}

	public void addEmployee(Employee obj) {
		// emps[counter] = obj;
		emps.add(obj);
		counter++;

		if (obj.getGrade() >= 5) {
			this.budget += 15000;
			// System.out.println("Bud --> " + this.budget);
		} else {
			this.budget += 10000;
			// System.out.println("Bud --> " + this.budget);
		}
	}

	public void Describe() {
		String temp = "Dept Name: " + this.deptName + " Budget: " + this.budget
				+ "\nEmployees: ";
		for (Employee x : emps) {
			if (x != null) {
				// temp += x.getEmpInfo() + " ";
				// temp += x.toString() + " ";
				temp += x;
			}
		}
		System.out.println(temp);
	}
}
