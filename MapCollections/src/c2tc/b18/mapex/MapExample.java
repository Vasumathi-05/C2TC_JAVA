package c2tc.b18.mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
	Map<Integer,String> map=new HashMap();
	map.put(703, "Vasu");
	map.put(705, "Sushi");
	map.put(714, "Tri");
	System.out.println("Print All Values");
	System.out.println(map);
	map.remove(714);
	System.out.println("Print Individual Item");
	for(Map.Entry<Integer,String>m:map.entrySet())
	{
		System.out.println(m);
	}
	map.put(705, "Sanjana");
	System.out.println("Print Individual Item using keyset");
	Set <Integer> key=map.keySet();
	Iterator<Integer> itr=key.iterator();
	while(itr.hasNext())
	{
		Integer id=itr.next();
		map.get(id);
	}
	}

}
