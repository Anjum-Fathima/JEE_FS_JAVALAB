/**
 * The Fibonacci sequence is defined by the following rule. The first 2 values in the sequence are 1, 1. 
 * Every subsequent value is the sum of the 2 values preceding it. Write a Java program that uses both 
 * recursive and non-recursive functions to print the nth value of the Fibonacci sequence?
 * @author ANJUM
 *
 */
public class Exercise3 {
	public static void main(String args[])
	{
       int num1=1;int num2=1;
       int result1 = fibonaccinonrecursive(num1,num2);
       System.out.println("Fibonacci using recursive");
       for(int i = 1; i <=10; i++)
       {
			System.out.println(fibonaccirecursive(i) +" ");
		}
}
	public static int fibonaccinonrecursive(int a,int b)
	{
		System.out.println("Fibonacci using non-recursive");
		System.out.println(a);
		System.out.println(b);
		int c;
		for(int i=0;i<8;i++)
		{
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		}
		return 0;
	}
	public static int fibonaccirecursive(int n)
	{
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
				return 1;
			}
		return fibonaccirecursive(n-2) + fibonaccirecursive(n-1);
	}
}
