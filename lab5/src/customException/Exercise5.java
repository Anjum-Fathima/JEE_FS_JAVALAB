package customException;

import Exception.employeeexception;
import Exception.insufficientage;
import Exception.notapropername;

public interface Exercise5 
{
   void ageofperson(int age) throws insufficientage ;
   void name(String name)throws notapropername;
   void employee(double salary)throws employeeexception;
}
