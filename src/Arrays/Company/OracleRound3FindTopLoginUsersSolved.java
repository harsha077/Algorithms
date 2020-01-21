package Arrays.Company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OracleRound3FindTopLoginUsersSolved {

	public static void main(String[] args) {
	
		String[] users = {"user1","user2","user4","user1","user2","user3","user1","user3","user2","user1"};
		int k=2;
		
		System.out.println(getTopUsers(users,k));
	}
	
	public static List getTopUsers(String[] users, int k){
		Map<String,Integer> map = new HashMap<String,Integer>();
		List<String> resultList = new ArrayList<String>();
		int topUserLogins = 0;
		int l = k;
		
		for(int i=0;i<users.length;i++){
			if(!map.containsKey(users[i])){
				map.put(users[i], 1);
			}else{
				int num = map.get(users[i]);
				num = num+1;
				map.put(users[i], num);
			}
		}
		
		List<Entry<String,Integer>> sortedMap = new LinkedList<Entry<String,Integer>>(map.entrySet());
		
		Collections.sort(sortedMap, new Comparator<Entry<String,Integer>>(){
			@Override
			public int compare(Entry<String,Integer> item1, Entry<String,Integer> item2){
				return item1.getValue().compareTo(item2.getValue());
			}
		});
		
		for(int i=sortedMap.size()-1;i>=0 && l>0;i--){
			boolean addToList = false;
			Entry<String,Integer> item = sortedMap.get(i);
			
			if(resultList.isEmpty()){
				addToList = true;
				topUserLogins = item.getValue();
			}else{
				if(topUserLogins == item.getValue()){
					addToList = true;
				}else{
					addToList = true;
					topUserLogins = item.getValue();
					l--;
				}
			}
			
			if(addToList && l>0){
				resultList.add(item.getKey());
				addToList = false;
			}
			
		}

		return resultList;
	}

}
