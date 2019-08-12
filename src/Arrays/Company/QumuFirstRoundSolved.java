package Arrays.Company;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class QumuFirstRoundSolved {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {0,-2,2,3,6,10};
		int target = 5;
		
		BitSet bit = new BitSet(array.length);
		
		getSumIndexes(array, target);
	}
	
	public static void getSumIndexes(int[] array, int target){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		BitSet bit = new BitSet(array.length);
		
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], i);
		}
		
		for(Entry item: map.entrySet()){
			Integer currentVal = (Integer)item.getKey();
			Integer currentIndex = (Integer)item.getValue();
			Integer remainingVal = target - currentVal;
			
			if(map.containsKey(remainingVal)){
				if(bit.get(currentIndex) != true && bit.get(map.get(remainingVal)) != true){
					System.out.println(currentIndex+","+map.get(remainingVal));
				}
				bit.set(currentIndex,true);
				bit.set(map.get(remainingVal),true);
			}
		}
	}

}
