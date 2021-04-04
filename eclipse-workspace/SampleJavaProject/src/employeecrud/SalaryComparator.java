package employeecrud;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee>{
	
	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		
		if(emp1.getEmpSalary() > emp2.getEmpSalary())
				return 1;
		else if(emp1.getEmpSalary() < emp2.getEmpSalary())
			return -1;
		else
			return 0;
	}

}
