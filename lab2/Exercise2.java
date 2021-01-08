/**
 * Create a method that can accept an array of String objects and sort in
 * alphabetical order. The elements in the left half should be completely in 
 * uppercase and the elements in the right half should be completely in lower case.
 *  Return the resulting array.
 * @author ANJUM
 */
import java.util.Scanner;
public class Exercise2 
{

public static void main(String[] args) 
{
     Scanner sc=new Scanner(System.in);
     System.out.println("enter number of strings you want");
     int n=sc.nextInt();
     String arr[]=new String[n];
     for(int i=0;i<n;i++)
     {
     arr[i]=sc.next();
     }
     String sort[]=sortString(arr);
     if(n%2==0)
     {
     for(int i=0;i<n;i++)
     {
    	 if(i<(n/2))
              System.out.println(sort[i].toUpperCase());
    	 else
    	System.out.println(sort[i]);
     }
     }
     if(n%2==1)
     {
     for(int i=0;i<n;i++)
     {
    	 if(i<=(n/2))
              System.out.println(sort[i].toUpperCase());
    	 else
    	System.out.println(sort[i]);
     }
     }
}
public static String[] sortString(String s[])
{
	int j;
	String temp;
	for(j=0;j<4;j++)
	{
		for(int l=j+1;l<4;l++)
		{
		if (s[j].compareTo(s[l])>0)
				{
			        temp=s[j];
			        s[j]=s[l];
			        s[l]=temp;
				}
	}
	}
	return s;
}
}
