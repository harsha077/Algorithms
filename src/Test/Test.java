package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Test {

	
	public static void main(String[] args) {
		
		sortTheMap();
		//sortTheList();
	}
	
	public static void sortTheMap(){
		Map<String,Integer> map = new HashMap<String,Integer>();
		List<String> resultList = new ArrayList<String>();
		
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
	
	public static void sortTheList(){
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(110);
		list.add(1);
		list.add(10);
		list.add(11);
		
		List<Integer> sortedList = new LinkedList<Integer>(list);
		
		Collections.sort(sortedList, new Comparator<Integer>(){

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
		
		for(Integer i: sortedList){
			System.out.println(i);
		}

	}
}
