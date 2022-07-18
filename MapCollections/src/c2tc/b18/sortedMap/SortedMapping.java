package c2tc.b18.sortedMap;
import java.util.SortedMap;
import java.util.TreeMap;
public class SortedMapping {

	public static void main(String[] args) {
     //Sorted According to the keys
	SortedMap<Integer,String> map=new TreeMap();
	map.put(742,"Vasu");
	map.put(715,"Kiran");
	map.put(705,"Sushi");
	System.out.println(map);
	}

}
