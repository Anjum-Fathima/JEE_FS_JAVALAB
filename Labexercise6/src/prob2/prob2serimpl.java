package prob2;

import java.util.HashMap;
import java.util.Map;

public class prob2serimpl 
{

	public Map getCount(char[] arr)
	{
		Map<Character,Integer> chars = new HashMap<>();
		//int count=0;
		for(int i=0;i<arr.length;i++)
		{
			int count=0;
			for(int j=0;j<arr.length;j++)
			{
			   if(arr[i]==arr[j])
			   {
				   count++;
			   }
			}
			 chars.put(arr[i],count);
		}
		//System.out.println(chars);
	    return chars;
	}
}
