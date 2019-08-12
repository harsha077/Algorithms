package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SortAndTraverseMap {

	public static void main(String[] args) {

	}
	
	public static void sortTheMap(Map<String, Integer> users){
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("user1", 3);
		map.put("user2", 2);
		map.put("user3", 2);
		map.put("user4", 4);
		
		for(Entry<String,Integer> item:map.entrySet()){
			//System.out.println(item.getKey() + " - "+item.getValue());
		}
		
		System.out.println("=========================================");
		
		List<Entry<String,Integer>> sortedMap = new LinkedList<Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(sortedMap, new Comparator<Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		
		List<String> keyList = new ArrayList<String>(map.keySet());
		
		for(int i = map.size()-1;i>=0;i--){
			String key = keyList.get(i);
			System.out.println(key);
		}
		
	}

}
