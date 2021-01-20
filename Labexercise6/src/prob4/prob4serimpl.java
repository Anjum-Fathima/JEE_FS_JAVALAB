package prob4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class prob4serimpl implements prob4ser
{
   
	@Override
	public HashMap getStudent(HashMap a) 
	{
		 HashMap<Integer,String> medal=new HashMap<>();
	    Iterator<Map.Entry<Integer,Integer>> it = a.entrySet().iterator();	
	    while(it.hasNext())
	    {
	    	Map.Entry<Integer, Integer> e = it.next();
	    	if(e.getValue()>=90)
	    	{
	    		int k=e.getKey();
	    		String r="Gold";
	    	    medal.put(k,r);	
	    	}
	    	if(e.getValue()>=80 && e.getValue()<90)
	    	{
	    		int k=e.getKey();
	    		String r="Silver";
	    	    medal.put(k,r);	
	    	}
	    	if(e.getValue()>=70 && e.getValue()<80)
	    	{
	    		int k=e.getKey();
	    		String r="Bronze";
	    	    medal.put(k,r);	
	    	}
	    }
		return medal;
	}

	
}
