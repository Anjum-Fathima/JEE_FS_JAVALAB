package prob3;

import java.util.HashMap;
import java.util.Map;

public class prob3serimpl implements prob3ser
{
@Override
public Map getSquares(int[] a) 
{
    	Map<Integer,Integer> numsq=new HashMap<>();
    	for(int i=0;i<a.length;i++)
    	{
    		int k=a[i]*a[i];
    		numsq.put(a[i],k);
    	}
	    return numsq;
}
}
