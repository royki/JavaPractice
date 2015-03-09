package exm.d2.project;

public class Employee {

	private String empName;
	private int grade;

	// Here we can have getter and setter method to set and get the name and
	// grade
	// Another way to do the same thing using constructor
	public Employee(String empName, int grade) {
		this.empName = empName;
		this.grade = grade;
	}

	public int getGrade() {
		return grade;
	}
	
	/*public String getEmpInfo() {
		return empName + "-> Grade: " + grade;
	}*/
	
	public String toString() {
		return empName + "-> Grade: " + grade;
	}
	
}
