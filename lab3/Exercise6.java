/**
 *  Create a method that accepts a String and checks if it is a positive string.
 *  A string is considered a positive string, if on moving from left to right each 
 *  character in the String comes after the previous characters in the Alphabetical order.
 *  For Example: ANT is a positive String (Since T comes after N and N comes after A). 
 *  The method should return true if the entered string is positive.
 *  @author ANJUM
 *
 */
import java.util.*;
public class Exercise6 {

	public static void main(String[] args)
	{
		System.out.println("Enter the word : ");
		Scanner sc=new Scanner (System.in);
        String word=sc.next();
        boolean result=positiveString(word);
        if(result==true)
        	System.out.println(word+" is a positive string");
        if(result==false)
        	System.out.println(word+" is not a positive string");
        
	}

	private static boolean positiveString(String word)
	{
		char[] arr=word.toCharArray();
		int len=word.length();
		int count=0;
		for(int i=0;i<len-1;i++)
		{
			if(arr[i]>arr[i+1])
			{
				break;
			}
			else
			{
				count++;
			}
		}
		if(count==len-1)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	

}
