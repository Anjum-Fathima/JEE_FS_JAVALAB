package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.Employeeserviceimpl;

public class Employeemain {
	
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		EmployeeService empser = new Employeeserviceimpl();
		
		String conti;
		do {
			System.out.println("choose option 1.give employee details 2.find insurance scheme 3.employee details");
			int ch=sc.nextInt();
		switch(ch)
		{
		case 1 :
			Employee emp=new Employee();
			System.out.println("enter empid,name,designation,salary");
			emp.setEmpid(sc.nextInt());
			emp.setName(sc.next());
			emp.setDesignation(sc.next());
			emp.setSalary(sc.nextDouble());
			empser.getemployeedetails(emp);
			break;
		case 2 :
			System.out.println("Enter your salary and Designation");
			Double salary=sc.nextDouble();
			String Designation=sc.next();
			empser.findinsuranceschemes(salary, Designation);
			break;
		case 3 :
			System.out.println("enter the employee id");
			int empid=sc.nextInt();
			empser.displaydetails(empid);
		}
		System.out.println("do you want to continue (yes/no)");
		conti=sc.next();
		}while(conti.equalsIgnoreCase("yes"));

	}

}
