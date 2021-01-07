import java.util.Scanner;

/**
 * Create a class with a method to find the difference 
 * between the sum of the squares and the square of the sum of the first
 *  n natural numbers.
 * @author ANJUM
 *
 */
public class Exercise6 {
public static void main(String[] args) 
    {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int result= calculateDifference(num);
	System.out.println(result);
	}
public static int calculateDifference(int n)
{
	int squaresum=0,sumsquare=0,sum=0;
	for(int i=1;i<=n;i++)
	{
		squaresum=squaresum+(i*i);
		sumsquare=sumsquare+i;
	}
	sum=squaresum-(sumsquare*sumsquare);
	return sum;
}

}
