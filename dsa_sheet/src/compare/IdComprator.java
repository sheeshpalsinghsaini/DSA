package compare;

import java.util.Comparator;

public class IdComprator implements Comparator<EmployeeComparator> {

	@Override
	public int compare(EmployeeComparator o1, EmployeeComparator o2) {
		return o1.getEmpId()-o2.getEmpId();
	}

}
