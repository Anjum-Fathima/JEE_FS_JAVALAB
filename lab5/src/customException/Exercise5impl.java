package customException;
import java.util.Scanner;

import Exception.employeeexception;
import Exception.insufficientage;
import Exception.notapropername;

public class Exercise5impl implements Exercise5 
{
	public Exercise5impl()
	{
	}
	@Override
	public void ageofperson(int age) throws insufficientage
	{	
	   if(age<15)
	   {
		   throw new insufficientage("Age should be more than 15");
	   }
	}
	@Override
	public void name(String namej) throws notapropername
	{
		int space=0;
		char[] a=namej.toCharArray();
		for(int i=0;i<namej.length();i++)
		{
			if(a[i]==' ')
			{
				space++;
			}
		}
		if(space<2)
		{
			throw new notapropername("Enter both Firstname and Lastname");
		}
		
	}
	@Override
	public void employee(double salary) throws employeeexception 
	{
	     if(salary<3000)
	     {
	    	 throw new employeeexception("Salary is less than 3000");
	     }
		
	}
}
