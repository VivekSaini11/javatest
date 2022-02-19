package test;

import java.util.Objects;

public class EmployeeImpl extends Employee{

	String empLastName;
	
	public String getEmpLastName() {
		return empLastName;
	}


	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	
	public EmployeeImpl(int empId, String empName, String empAddress, String empLastName) {
		super(empId, empName, empAddress);
		this.empLastName=empLastName;
	}

	
	public Employee getEmployee() {
		return new EmployeeImpl(2,"Frank","Nr. Cosmos,1223","ddd");
	}

	@Override
	public int getId() {
		return 0;
	}
	
	/*
	 * @Override public boolean equals(Object o) { if (this == o) return true; if (o
	 * == null || getClass() != o.getClass()) return false; Employee employee =
	 * (Employee) o; return empId == employee.empId && Objects.equals(empName,
	 * employee.empName) && Objects.equals(empAddress, employee.empAddress) &&
	 * Objects.equals(getEmpLastName(), employee.getEmpLastName().length());
	 * 
	 * }
	 * 
	 * @Override public int hashCode() { return Objects.hash(empId, empName,
	 * empAddress, getEmpLastName().length()); }
	 */
}
