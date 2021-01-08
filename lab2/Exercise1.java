/**
 * Create a method which accepts an array of integer elements and 
 * return the second smallest element in the array.
 * @author ANJUM
 */
import java.util.*;
import java.io.*;
public class Exercise1 
{
public static void main(String[] args) 
{
	 Scanner sc=new Scanner(System.in);	
	 int arr[]=new int[10];
	 System.out.println("give any four integers");
	 for(int i=0;i<4;i++)
	 {
		 arr[i]=sc.nextInt();
	 }
	 int result=getSecondSmallest(arr);
	 System.out.println(result);
}
public static int getSecondSmallest(int a[])
{
		int j,temp;
		for(j=0;j<4;j++)
		{
			for(int l=j+1;l<4;l++)
			{
			if (a[j]>=a[l])
					{
				        temp=a[j];
				        a[j]=a[l];
				        a[l]=temp;
					}
		}
		}
		
		return a[1];
}

}
