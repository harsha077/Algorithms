package Test;

import java.util.HashMap;
import java.util.Map;

import sun.font.CreatedFontTracker;

public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "qwertyuiop";
		
		Map<Character, Integer> map = createRowMap(str);
		
		System.out.println(map.containsKey('t'));
		
	}

	public static Map createRowMap(String row)
    {
        Map<Character,Integer> map = new HashMap<Character, Integer>();
        for(int i=0;i<row.length();i++)
        {
            map.put(row.charAt(i),1);
        }
       
        return map;
    }
}
