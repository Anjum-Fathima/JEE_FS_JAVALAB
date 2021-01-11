/**
 * Create a method which accepts a String and replaces
 * all the consonants in the String with the next alphabet
 * @author ANJUM
 *
 */
import java.util.*;
public class Exercise3 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		String word=sc.next();
		String result= alterString(word);
		System.out.println(result);
	}
	public static String alterString(String str)
	{
		str.toLowerCase();
		String str1="";
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='z')
			{
				str1=str1+'b';
			}
			else if(str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u' )
			{
				str1=str1+(char)(str.charAt(i)+1);	
			}
			else
			{
				str1=str1+(char)(str.charAt(i));
			}
		}
		return str1;
	}

}
