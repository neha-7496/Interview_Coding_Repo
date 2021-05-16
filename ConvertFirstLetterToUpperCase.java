package String_problems;

import java.util.Arrays;

public class ConvertFirstLetterToUpperCase {
    public static void main(String[] args) {
    	String str = "have a nice day";
    	String[] strArray = str.split(" ");
    	StringBuffer sb = new StringBuffer();
    	for(int i = 0;i<strArray.length;i++) {
    		strArray[i] = strArray[i].replace(strArray[i].charAt(0), Character.toUpperCase(strArray[i].charAt(0)));
    		sb.append(strArray[i]+" ");
    	}
    	System.out.println(sb.toString());
    	
    }
}
