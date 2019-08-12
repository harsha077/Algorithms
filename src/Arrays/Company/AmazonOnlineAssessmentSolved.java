package Arrays.Company;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class AmazonOnlineAssessmentSolved {

	
	public static void main(String[] args) {
		int[] array = {20,70,90,30,60,110};
		int target = 110;
		
		/*int[] array = {100,180,40,120,10};
		int target = 250;*/
		
		int[] resultArr = getSumIndexes(array,target);
		
		for (int i = 0; i < resultArr.length; i++) {
			System.out.println(resultArr[i]);
		}
	}

	public static int[] getSumIndexes(int[] array, int target){
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] resultArr = new int[2];
		BitSet bit = new BitSet(array.length);
		Integer maxNumber = target-30;
		Integer maxIndex1 = null;
		Integer maxIndex2 = null;
		Integer maxValue1 = null;
		Integer maxValue2 = null;
 		
		for (int i = 0; i < array.length; i++) {
			map.put(array[i], i);
		}
		
		for(Entry item: map.entrySet()){
			Integer currentVal = (Integer)item.getKey();
			Integer currentIndex = (Integer)item.getValue();
			Integer remainingVal = maxNumber - currentVal;
			
			if(map.containsKey(remainingVal)){
				if(maxIndex1 == null && maxIndex2 == null){
					 maxIndex1 = currentIndex;
					 maxIndex2 = map.get(remainingVal);
					 maxValue1 = currentVal;
					 maxValue2 = remainingVal;
				}else{
					if((currentVal > maxValue1 && currentVal > maxValue2) || (remainingVal > maxValue1 && remainingVal > maxValue2)){
						maxIndex1 = currentIndex;
						maxIndex2 = map.get(remainingVal);
						maxValue1 = currentVal;
						maxValue2 = remainingVal;
					}
				}
			}
		}
		
		resultArr[0] = maxIndex1;
		resultArr[1] = maxIndex2;
		
		return resultArr;
	}
	
}
