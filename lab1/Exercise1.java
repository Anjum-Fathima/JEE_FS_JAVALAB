/**
 *  Create a method to find the sum of the cubes of the digits of an n digit number
 * @author ANJUM
 *
 */
public class Exercise1 {

	public static void main(String[] args) 
	{
		int number=34;
		int result = Sum(number);
		System.out.println(result);

	}
	public static int Sum(int num)
	{
		int n=num,sum=0;
		while(n%10!=0)
		{
		 int k=n%10;
		 int c=k*k*k;
		 sum=sum+c;
		 n=n/10;
		}
		return sum;
	}

}
