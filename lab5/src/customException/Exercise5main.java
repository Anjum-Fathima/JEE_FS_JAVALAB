package customException;

import java.util.*;

import Exception.employeeexception;
import Exception.insufficientage;
import Exception.notapropername;

public class Exercise5main {

	public static void main(String[] args) {
		Exercise5 ex5=new Exercise5impl();
		Scanner sc=new Scanner(System.in);
		System.out.println("choose option 1.enter age 2.enter name 3.enter employee salary");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1 : 
	         int x=sc.nextInt(); 
	         try
	         {
	            ex5.ageofperson(x); 
	         }catch(insufficientage e)
	         {
	    	    System.out.println("Problem is : "+e.getMessage());
	         }
	         break;
		case 2 :
	        System.out.println("enter name");
            String namej=sc.next();
	        try
	        {
	    	   ex5.name(namej);
	        }catch(notapropername e)
	        {
	    	  System.out.println("problem is : "+e.getMessage());
	        }
	        break;
		case 3 :
			System.out.println("Enter salary of the employee");
			double salary=sc.nextDouble();
			try
			{
				ex5.employee(salary);
			}catch(employeeexception e)
			{
				System.out.println("Problem is : "+e.getMessage());
			}
			break;
	    
	}

}
}
