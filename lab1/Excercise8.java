/**
 * Create a method to check if a number is a power of two or not
 * @author ANJUM
 *
 */
import java.util.Scanner;
public class Excercise8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		boolean result=checkNumber(number);
		if(result==true)
			System.out.println(number+" is a power of 2");
		
	}
	public static boolean checkNumber(int n)
	{
	   int k=2,m=2;
	   boolean flag=false;
		for(int i=0;i<n;i++)
		{
			m=m*k;
			if(n==m)
			{
				flag=true;
				break;
			}
		}
		return flag;
	}

}
