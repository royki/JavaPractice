package exm.d2.project;

public class TestCompany {

	public static void main(String[] args) {

		Employee Rod = new Employee("A Rod", 6);
		Employee Jessi = new Employee("C Jessi", 4);
		Employee Chene = new Employee("B Chene", 3);

		Department Sales = new Department("XYZ-Sales");
		Department IT = new Department("XYZ-IT");

		Sales.addEmployee(Rod);
		Sales.addEmployee(Jessi);
		
		IT.addEmployee(Chene);
		
		Sales.Describe();
		IT.Describe();
	}

}
