/**
 * Write a Java program that displays the number of
 * characters, lines and words in a text? 
 * @author ANJUM
 *
 */
import java.util.Scanner;
public class Exercise5 {

	public static void main(String[] args)
	{
		System.out.println("Enter the text: ");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		countingInString(sentence);
	}

	private static void countingInString(String s) 
	{
		int spaces=0,lines=0;
		int characs=s.length();
		System.out.println("Number of characters are : "+characs);
		char[] arr=new char[s.length()];
		arr=s.toCharArray();
		for(char i=0;i<s.length();i++)
		{
			if(arr[i]==' ')
				spaces++;
			if(arr[i]=='.')
			{
				lines++;
			}
		}
		System.out.println("Number of words are : "+(spaces+1));
		System.out.println("Number of lines are : "+(lines));
		
	}

}
