package test;

import java.util.Objects;

public abstract class Employee {
    int empId;
    String empName;
    String empAddress;
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    
    public abstract Employee getEmployee();
    
    public abstract int getId();
    
    public abstract String getEmpLastName();
    
    public Employee(int empId, String empName, String empAddress) {
        this.empId = empId;
        this.empName = empName;
        this.empAddress = empAddress;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        if(employee.getEmpLastName()!=null) {
            return   Objects.equals(empName, employee.empName) &&
                     Objects.equals(empAddress, employee.empAddress) &&
                     Objects.equals(getEmpLastName().length(), employee.getEmpLastName().length());
        }else {
        	  return   Objects.equals(empName, employee.empName) &&
                      Objects.equals(empAddress, employee.empAddress);
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(empId, empAddress);
    }
}
