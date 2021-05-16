package interviewRelated;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindRepeatingChar {

	public static void main(String[] args) {
		String str = "Banana";
		Map<Character, Integer> map = new HashMap<Character,Integer>();
		for(int i = 0; i < str.length();i++) {
			if(!map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), 1);
			}else {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}
		for(Entry<Character, Integer> map1 : map.entrySet()) {
			if(map1.getValue() > 1) {
				System.out.println("Repeated character:"+map1.getKey()+" frequency:"+map1.getValue());
			}
		
		}
		

	}

}
