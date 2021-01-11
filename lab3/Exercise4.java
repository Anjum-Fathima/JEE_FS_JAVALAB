/**
 * Create a method that accepts a number and modifies it such
 * that the each of the digit in the newly formed number is 
 * equal to the difference between two consecutive digits in the original number.
 * The digit in the units place can be left as it is. 
 * Note: Take the absolute value of the difference. Ex: 6-8 = 2
 * @author ANJUM
 *
 */
import java.util.*;
//import java.Math.abs;
public class Exercise4 {

	public static void main(String[] args) {
		System.out.println("Enter the number to be modified : ");
		Scanner sc=new Scanner(System.in);
		int number1=sc.nextInt();
		int result=modifyNumber(number1);
	}
	public static int modifyNumber(int num)
	{
		String str=Integer.toString(num);
		int len=str.length();
		char[] a=str.toCharArray();
		int o=Character.getNumericValue(a[1]);
		System.out.println("Modified Number is : ");
		for(int i=0;i<(len-1);i++)
		{
			int curr=Character.getNumericValue(a[i]);
			int next=Character.getNumericValue(a[i+1]);
			System.out.print(Math.abs(curr-next));	
		}
		System.out.print(a[len-1]);
		return num;
	}

}
