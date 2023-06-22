package com;

public class StaticExample {

	public static void main(String[] args) {
		Abc obj1 = new Abc();
		obj1.a=100;//instance variable
		Abc.b=200;//static variable
		
		obj1.dis1();//non static method
		Abc.dis2(); //estatic method
		
		obj1.b=300;			// static variable through object 
		obj1.dis2();     // access static through object also. 
		System.out.println("---------------------------");
		
		//STATIC MEMORY
		Employee emp1 = new Employee(); //heap memory
		Employee emp2 = new Employee(); //heap memory
		
		emp1.name= "Pepe";
		emp1.salary = 10000;
		emp1.managerId=123;
		Employee.managerId=124;
		
		emp2.name= "PepA";
		emp2.salary = 10100;
		emp2.managerId=125;
		Employee.managerId=126;
		
		emp1.disEmpInfo();	
		emp2.disEmpInfo();
		

	}

}
