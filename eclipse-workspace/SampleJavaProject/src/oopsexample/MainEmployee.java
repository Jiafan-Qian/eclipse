package oopsexample;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*// object/instance creation
		Employee emp = new Employee();
		
		
		emp.empId = 12345;
		emp.empName = "Marks Zuckberg";
		
		emp.calculateSalary();
		*/
		
		/*
		PartTimeEmployee pte = new PartTimeEmployee();
		pte.calculateSalary();
		pte.empId = 4567;
		pte.empName = "Sundar Pichai";
		*/
		
		DailyWageLabour dwl = new DailyWageLabour();
		dwl.calculateSalary();
		
		PartTimeEmployee pte = new PartTimeEmployee();
		pte.calculateSalary();
		
		FullTimeEmployee fte = new FullTimeEmployee();
		fte.calculateSalary();
		
	}

}
