package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;




class TestComp implements Comparator<String>{
		
	@Override
	public int compare(String o1, String o2){
		return o1.compareTo(o2);
	}
	
	@Override
	public Comparator<String> reversed() {
		return this;
	}

}

class TestComparator {
	
	public static void main(String...args){
		List<String> list = new ArrayList<String>();
		list.add("man");
		list.add("hanu");
		list.add("77");
		
		sortList(list);
		
	}
	
	public static void sortList(List<String> list){
		TestComp testComp = new TestComp();
		//Collections.sort(list, testComp);
		
		/*Collections.sort(list, new Comparator<String>(){
			@Override
			public int compare(String o1, String o2){
				return o1.compareTo(o2);
			}
		});*/
		
		for(String str:list){
			System.out.println(str);
		}
	}
	
	public static void reverseTheOrder(List<String> list){
		
	}
}