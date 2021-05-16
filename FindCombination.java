package interviewRelated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

class FindCombination {
    
    public static void main(String [] args){
        int key = 7; 
        int arr[]= new int []{10, 8, 9, -2, -3, 7, 4, 3, 3, 1};
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i : arr){
            list.add(i);
        }
        for(int i = 0; i < arr.length ; i++){
            if((list.contains(arr[i]-key) || list.contains(key - arr[i]))){
                map.put(arr[i],arr[i]-key);
            }
        }
        System.out.println(map);
        for(Entry<Integer, Integer> entryMap : map.entrySet()){
            System.out.println(entryMap.getKey()+","+entryMap.getValue());
        }
    }
}
