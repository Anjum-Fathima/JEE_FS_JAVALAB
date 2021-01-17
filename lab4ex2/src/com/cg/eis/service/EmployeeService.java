package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService
{
	 void getemployeedetails(Employee emp);
    void findinsuranceschemes(double salary,String designation);
    void displaydetails(int empid);
   
}
