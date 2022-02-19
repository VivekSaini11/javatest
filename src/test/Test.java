package test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

class Test {
	

 public static void main(String args[])
 {
		/*
		 * Set<Employee> employees = new HashSet<>(); employees.add(new
		 * EmployeeImpl(1,"John","fff","aad")); employees.add(new
		 * EmployeeImpl(2,"Frank","Nr. Cosmos,", null)); employees.add(new
		 * EmployeeImpl(3,"Danyy","street 101,Washington DC,", "mmvv"));
		 * employees.add(new EmployeeImpl(1,"John","street 1,", null));
		 * employees.add(null); //employees.add(new Employee(2,"Frank","Nr. Cosmos,"));
		 * 
		 * Employee e4= new EmployeeImpl(3,"Danyy","street 101,Washington DC,",null);
		 * 
		 * //boolean e4Exists = Stream.of(e4).anyMatch( e -> employees.contains(e));
		 * boolean e4Exists = employees.contains(e4);
		 */
     
	 String x = "ABC Factoring c/o Johns Trucking";
	 String initials = null;
	 
	 boolean notEmpty = x!=null;
	 System.out.println(notEmpty);
	 
	 String[] nameparts = x.split("c/o");
		if (nameparts.length>1 && nameparts[1] != null) {
			initials = nameparts[1];
		} else if (nameparts[0] != null) {
			initials = nameparts[0];
		}
	 
     System.out.println(initials);
			 
 }
}

