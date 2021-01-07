/**
 * Create a method to check if a number is an increasing number
 */
import java.util.Scanner;
class Exercise7{
    public static void main(String args[]) 
    {
       int num; 
       Scanner sc = new Scanner(System.in);
       num = sc.nextInt();
       boolean result=checkNumber(num);
       if (result==true)
        	System.out.println(num+" is a increasing number");
       else
    	   System.out.println(num+" is not a increasing number");
    }
    public static boolean checkNumber(int num)
    {
       boolean flag=false;
       int number=num;
       int curr = num % 10;
       num = num/10;
       while(num>0)
       {
           if(curr <= num % 10)
           {
               flag = true;
               break;
           }
           curr=num % 10;
           num = num/10;
       }
       if(flag)
       {
    	   return false;
       }
       else{
    	   return true;
       }
    }
}