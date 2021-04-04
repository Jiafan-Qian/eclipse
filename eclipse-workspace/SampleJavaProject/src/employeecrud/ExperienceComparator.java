package employeecrud;

import java.util.Comparator;

public class ExperienceComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		if (emp1.getExperience() == emp1.getExperience())
			return 0;
		else if (emp1.getExperience() > emp2.getExperience())
			return 1;
		else
			return -1;
	}
	

}
