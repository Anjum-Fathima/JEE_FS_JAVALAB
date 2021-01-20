package prob1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class prob1serviceimpl implements prob1service
{

	@Override
	public List getValues() {
		HashMap<Integer,String> names=new HashMap<Integer,String>();
		names.put(83,"Anjum");
		names.put(95,"Nadeem");
		names.put(90,"Talib");
		names.put(96,"Aliya");
		System.out.println("-----------before--------------");
		System.out.println(names);
		System.out.println("-----------after--------------");
//		TreeMap<String,Integer> tree= new TreeMap<String,Integer>(names);
//		System.out.println(tree);
		List<String> list = new ArrayList<String>(names.values());
		Collections.sort(list);
		return list;
	}

}
