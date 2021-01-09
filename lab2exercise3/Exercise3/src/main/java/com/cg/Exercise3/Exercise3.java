package com.cg.Exercise3;

public class Exercise3 {
	public static void main(String args[])
	{
		int arr[]=new int[] {8,3,9,1};
		int result=sort(arr);
		System.out.println(result);
	}
	public static int sort(int a[])
	{
		
		if(a.length==0)
		{
			return 0;
		}
		else
		{
			int rev[]=new int [a.length];
			String charac;
		String array[]=new String[a.length];
		for(int i=0;i<a.length;i++)
		{
			charac=Integer.toString(a[i]);
			array[i]=charac;
		}
		
		for(int m=0;m<a.length;m++)
		{
			rev[m]=Integer.parseInt(array[m]);	
		}
		for(int j=0;j<rev.length;j++)
		{
			for(int k=j+1;k<rev.length;k++)
			{
				if(rev[j]>rev[k])
				{
				int temp=rev[j];
				rev[j]=rev[k];
				rev[k]=temp;
				}
			}
		}
		for(int n=0;n<=a.length;n++)
		{
			System.out.println(rev[n]);
		}
		
			return 0;
		}
	    
	}
}
