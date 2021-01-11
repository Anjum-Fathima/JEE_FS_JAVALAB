/**
 *  Write a Java program that reads a line of integers and then displays each integer
 *  and the sum of all integers. (Use String Tokenizer class)?
 * @author ANJUM
 *
 */
import java.util.*;
public class Exercise1 
{
    public static void main(String[] args) 
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string : ");
		String numberstr=sc.next();
	    int result=calSum(numberstr);
	    System.out.println("sum is : "+result);
	}
	public static int calSum(String numberstr)
	{
		int sum=0;
		int len=numberstr.length();
		int number=Integer.parseInt(numberstr);
		int numarray[]=new int[len];
		int i=0;
		while(number%10!=0)
		{
			int k=number%10;
			numarray[i]=k;
			i++;
			number=number/10;
		}
		System.out.println("Numbers in the string are : ");
		for(int m=len-1;m>=0;m--)
		{
			System.out.println(numarray[m]);
			sum=sum+numarray[m];
		}
         return sum;
	}
}