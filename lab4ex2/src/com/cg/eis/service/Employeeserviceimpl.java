package com.cg.eis.service;

import java.util.ArrayList;
import java.util.List;
import com.cg.eis.bean.Employee;
import java.util.Scanner;
public class Employeeserviceimpl implements EmployeeService{
    private Employee emp;
    public Employeeserviceimpl() {
		//emp=new Employee();
	}

	List<Employee> emplist=new ArrayList<Employee>();
	@Override
	public void getemployeedetails(Employee emp) {
	       emplist.add(emp);
	       System.out.println(emplist);
	}
	@Override
	public void findinsuranceschemes(double salary, String designation)
	{
		if(salary<=20000 && designation.equalsIgnoreCase("analyst"))
		{
			System.out.println("LIC1 and LIC2 insurance schemes are available ");
		}
		if(salary>20000 && designation.equalsIgnoreCase("analyst"))
		{
			System.out.println("LIC3 and LIC4 insurance schemes are available ");
		}
		
	}
	@Override
	public void displaydetails(int empid) 
	{
		//System.out.println(emplist);
		for (Employee e : emplist) {
			if(empid==e.getEmpid())
			{
				System.out.println(e);
			}
		}
		
	}

	

}
