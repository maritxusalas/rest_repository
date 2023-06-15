package com;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.setEmployee(100, "Steven", 15000);
		System.out.println("Employee Details");
		emp1.disEmployee();
		System.out.println("--------------------");
		
		System.out.println();
		
		System.out.println("--------------------");		
		Manager mgr1 = new Manager();
		mgr1.setEmployee(101, "Lex",4500);
		mgr1.setManager(15);
		System.out.println("Manager details ");
		mgr1.disManager();
		mgr1.disEmployee();
		System.out.println("--------------------");
		
		System.out.println();
		
		System.out.println("--------------------");	
		Developer dev1 = new Developer();
		dev1.setEmployee(102, "Neena", 2800);
		dev1.setDeveloper("Java");
		System.out.println("Developer details");
		dev1.disDeveloper();
		dev1.disEmployee();
	}

}
