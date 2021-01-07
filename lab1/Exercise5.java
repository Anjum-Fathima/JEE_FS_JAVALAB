import java.util.*;
/**
 * Create a class with a method which can calculate the sum of first n
 * natural numbers which are divisible by 3 or 5.
 * @author ANJUM
 *
 */
public class Exercise5 {

	public static void main(String[] args) 
     {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int result= calculateSum(num);
		System.out.println(result);
      }
	public static int calculateSum(int n)
	{
		int i,sum=0;
		for(i=1;i<=n;i++)
		{
			if(i%3 == 0 || i%5 == 0 )
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
