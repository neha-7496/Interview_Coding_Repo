package interviewRelated;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("flower");
		list.add("flowerist");
		list.add("flowiierist");
		String minString = "";
		int min_size = 0;
		for(String str: list) {
			if(minString.isEmpty()) {
				minString = str;
				min_size = minString.length();
			}else {
				if(str.length() < min_size) {
					minString = str;
					min_size = str.length();
				}
			}
		}
		System.out.println(minPrefix(minString, list));
	}
	public static String minPrefix(String minString,List<String> list) {
		String min_prefix = "";
		for(int i = 0; i < minString.length(); i++ ) {
			for(int j = 0; j < list.size(); j++ ) {
				if(minString.charAt(i) != list.get(j).charAt(i)) {
					return min_prefix;
				}
			}
			min_prefix += minString.charAt(i);
		}
		return min_prefix;

	}

}
